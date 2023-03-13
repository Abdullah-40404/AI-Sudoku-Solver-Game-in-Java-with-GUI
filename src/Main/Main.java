package Main;

import BL.GeneticAlgorithm;
import UI.PrintBoard;

public class Main {
    public static void main(String[] args) {

        int populationSize = 10000;
        int maxIterations = 1500;

        int initial_arr[] = new int[] {
                9, 0, 7, 0, 0, 0, 2, 0, 4,
                0, 0, 0, 0, 0, 7, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0,
                1, 0, 0, 0, 6, 0, 0, 0, 2,
                0, 2, 0, 0, 0, 1, 0, 0, 0,
                3, 0, 0, 0, 2, 0, 0, 0, 1,
                0, 0, 5, 0, 0, 0, 6, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 5,
                7, 0, 6, 0, 0, 0, 4, 0, 0,
        };

        PrintBoard obj_Print = new PrintBoard(initial_arr);
        GeneticAlgorithm obj_gen_algorithm = new GeneticAlgorithm();
        int[] finalgene = obj_gen_algorithm.getFinalGene(initial_arr, populationSize, maxIterations);
        obj_Print.set_Board(finalgene);

    }
}