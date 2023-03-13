package BL;

import java.util.Random;

public class Static_Members {

    public static int[] InitialGeneVal;
    static int OptimalArray[][];

    public static String Convert_toString(int gene[]) {
        String string = "";
        for (int i : gene) {
            string += i;
        }
        return string;
    }

    public static int[] initialize(int[] gene) {
        int dimensions = (int) Math.sqrt(gene.length);

        for (int i = 0; i < gene.length; i++) {
            if (gene[i] == 0)
                gene[i] = new Random().nextInt(dimensions) + 1;
        }

        return gene;
    }

}
