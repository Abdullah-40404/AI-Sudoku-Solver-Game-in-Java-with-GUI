package BL;

public class Fitness_Funtion {

    public int Return_fitness_Value(int[] gene, Dimension_Convert obj_dc) {

        int fitness = 0;
        int[][] newGene = obj_dc.Conversion_oneD_To_TwoD(gene);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (Static_Members.OptimalArray[i][j] == newGene[i][j]) {
                } else {
                    fitness++;
                }
            }
        }
        return fitness;
    }
}
