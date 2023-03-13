package BL.Steps;

import java.util.Random;
import java.util.Vector;

import BL.Sudoku;

public class Selection {

    public Sudoku Selection_Of_Sudokuos(Vector<Sudoku> population) {

        Random random = new Random();

        if (random.nextBoolean())
            return bestSelection(population);
        else
            return rouletteSelection(population);
    }

    public Sudoku bestSelection(Vector<Sudoku> sudokus) {
        Sudoku min = sudokus.firstElement();
        for (Sudoku sudoku : sudokus)
            if (sudoku.fitnessValue < min.fitnessValue)
                min = sudoku;

        return min;
    }

    public Sudoku rouletteSelection(Vector<Sudoku> sudokus) {
        int max = 0;
        for (Sudoku sudoku : sudokus)
            if (sudoku.fitnessValue > max)
                max = sudoku.fitnessValue;
        int sum = 0;
        for (Sudoku sudoku : sudokus)
            sum += max - sudoku.fitnessValue;
        for (Sudoku sudoku : sudokus)
            sudoku.setProbability((max - sudoku.fitnessValue) / (sum * 1.0));

        double random = Math.random() * sum;
        int i;
        for (i = 0; i < sudokus.size() && random > 0; i++) {
            random -= max - sudokus.get(i).fitnessValue;
        }
        return sudokus.get(i - 1);
    }

}
