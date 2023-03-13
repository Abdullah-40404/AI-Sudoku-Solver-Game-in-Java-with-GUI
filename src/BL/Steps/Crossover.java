package BL.Steps;

import java.util.Random;
import BL.Sudoku;

public class Crossover {

    public void crossover(Sudoku sudoku1, Sudoku sudoku2) {
        int sudoku1_len = sudoku1.getGene().length;
        int[] sudoku1_gene = sudoku1.getGene();

        int sudoku2_len = sudoku2.getGene().length;
        int[] sudoku2_gene = sudoku2.getGene();

        int start = new Random().nextInt(sudoku1_len);
        int end = new Random().nextInt(sudoku2_len - start) + start;
        int[][] crossover = crossover(sudoku1_gene, sudoku2_gene, start, end);

        sudoku1.setGene(crossover[0]);
        sudoku2.setGene(crossover[1]);
    }

    public static int[][] crossover(int[] gene1, int[] gene2, int start, int end) {
        int[][] newGene = new int[2][gene1.length];
        for (int i = 0; i < gene1.length; i++) {
            if (i >= start && i <= end) {
                newGene[0][i] = gene2[i];
                newGene[1][i] = gene1[i];
            } else {
                newGene[0][i] = gene1[i];
                newGene[1][i] = gene2[i];
            }
        }
        return newGene;
    }

}
