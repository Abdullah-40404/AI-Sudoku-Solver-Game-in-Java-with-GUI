package BL.Steps;

import java.util.Random;

import BL.Sudoku;

public class Mutation {

    public void mutation(Sudoku sudoku) {

        int sudoku_len = sudoku.getGene().length;
        int[] sudoku_gene = sudoku.getGene();
        int dimensions = (int) Math.sqrt(sudoku_len);
        int[] mutation = mutation(sudoku_gene, new Random().nextInt(sudoku_len), new Random().nextInt(dimensions) + 1);
        sudoku.setGene(mutation);
    }

    public int[] mutation(int[] gene, int index, int value) {
        gene[index] = value;

        return gene;
    }

}
