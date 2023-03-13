package BL;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Vector;
import BL.Steps.Crossover;
import BL.Steps.Mutation;
import BL.Steps.Selection;
import TF.File_read;

public class GeneticAlgorithm {

    public int[] getFinalGene(int[] initial_arr, int populationSize, int maxIterations) {

        Selection obj_Selection = new Selection();
        Mutation obj_Mutation = new Mutation();
        Crossover obj_Crossover = new Crossover();
        Random random = new Random();
        int max_i = 0;

        Static_Members.InitialGeneVal = initial_arr;

        File_read obj_File_read = new File_read();
        try {
            Static_Members.OptimalArray = obj_File_read.get_optimal_solution().clone();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound");
            e.printStackTrace();
            System.out.println("\n");
            System.exit(0);
        }

        Sudoku sudoku = new Sudoku(Static_Members.initialize(Static_Members.InitialGeneVal.clone()));
        for (; sudoku.getFitnessValue() != 0 && max_i < maxIterations; max_i++) {
            System.out
                    .println("\n" + "Current_Sudoku: " + sudoku.Return_String() + ", Iteration_count: " + max_i + "\n");
            Vector<Sudoku> population = new Vector<>();

            for (int i = 0; i < populationSize; i++) {
                population.add(new Sudoku(sudoku.getGene().clone()));
            }

            for (int i = 0; i < ((population.size() * 70) / 100); i++) {
                obj_Crossover.crossover(population.get(i), population.get(random.nextInt(population.size())));
            }
            for (int i = ((population.size() * 70) / 100); i < population.size(); i++) {
                obj_Mutation.mutation(population.get(i));
            }

            sudoku = obj_Selection.Selection_Of_Sudokuos(population);
        }

        System.out.println("\n" + "Final: " + sudoku.Return_String() + ", Final_iteration: " + max_i);
        return sudoku.getGene();
    }
}
