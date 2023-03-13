package BL;

public class Dimension_Convert {

    private int DIMENSION = 9;

    public int Return_Dimension() {
        return DIMENSION;
    }

    public int[] Conversion_twoD_To_OneD(int[][] twoD) {
        int[] oneD = new int[DIMENSION * DIMENSION];
        for (int i = 0; i < oneD.length; i++)
            oneD[i] = twoD[i / DIMENSION][i % DIMENSION];

        return oneD;
    }

    public int[][] Conversion_oneD_To_TwoD(int[] oneD) {
        int[][] twoD = new int[DIMENSION][DIMENSION];
        for (int i = 0; i < oneD.length; i++)
            twoD[i / DIMENSION][i % DIMENSION] = oneD[i];

        return twoD;
    }

}
