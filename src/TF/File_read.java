package TF;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class File_read {

    public int[][] get_optimal_solution() throws FileNotFoundException {
        
        Scanner sc = new Scanner(new BufferedReader(new FileReader("C:/Users/abdul/Desktop/My Git Repository/AI-Sudoku-Solver/AI-Sudoku-Solver-Game-in-Java-with-GUI/src/TF/Solution_File.txt")));
        int rows = 9;
        int columns = 9;
        int[][] myArray = new int[rows][columns];
        while (sc.hasNextLine()) {
            for (int i = 0; i < myArray.length; i++) {
                String[] line = sc.nextLine().trim().split(" ");
                for (int j = 0; j < line.length; j++) {
                    myArray[i][j] = Integer.parseInt(line[j]);
                }
            }
        }
        return myArray;
    }

}
