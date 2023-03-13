package BL;

public class Sudoku {

    Dimension_Convert obj_dc = new Dimension_Convert();
    Fitness_Funtion obj_ff = new Fitness_Funtion();
    private int[] gene;

    public int fitnessValue;
    private double probability;

    public Sudoku(int[] gene) {
        this.gene = gene;
        fitnessValue = obj_ff.Return_fitness_Value(gene, obj_dc);

    }

    public int[] getGene() {
        return gene;
    }

    public void setGene(int[] gene) {
        this.gene = gene;
        fitnessValue = obj_ff.Return_fitness_Value(gene, obj_dc);
    }

    public int getFitnessValue() {
        return fitnessValue;
    }

    public void setFitnessValue(int fitnessValue) {
        this.fitnessValue = fitnessValue;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public String Return_String() {

        String string = "";
        string += "Gene: ";
        string += Static_Members.Convert_toString(this.gene);
        for (int i = 0; i < gene.length; i++) {
            string += ((i % obj_dc.Return_Dimension() == 0) ? "\n" : "") + gene[i] + " ";
        }
        string += "\nFitness: " + fitnessValue;
        return string;
    }
}