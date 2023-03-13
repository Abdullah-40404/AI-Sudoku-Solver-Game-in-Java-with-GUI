package UI;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class PrintBoard {

   JFrame frame;
   Font myFont = new Font("", Font.BOLD, 30);
   JPanel panel;
   LinkedList<JPanel> jpanel_arr = new LinkedList<JPanel>();

   public PrintBoard(int initial_arr[]) {

      frame = new JFrame("AI Suduko Solver by 19L-2745");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(555, 580);
      frame.setLayout(null);
      int index = 0;

      for (int a = 0; a < 3; a++) {
         for (int b = 0; b < 3; b++) {
            panel = new JPanel();

            panel.setBounds(b * 166 + 20, a * 166 + 20, 166, 166);
            panel.setLayout(new GridLayout(3, 3, 2, 2));
            panel.setBorder(BorderFactory.createLineBorder(Color.black.darker()));

            JButton[] numberButtons = new JButton[9];
            index = (b * 3) + (a * 3 * 3 * 3);
            for (int i = 0; i < 9; i++, index++) {
               if ((i % 3 == 0) && (i > 0)) {
                  index += 6;
               } else {
               }
               if (initial_arr[index] != 0) {
                  numberButtons[i] = new JButton(String.valueOf(initial_arr[index]));
                  numberButtons[i].setBackground(Color.green.brighter());
               } else {
                  numberButtons[i] = new JButton();
                  numberButtons[i].setBackground(Color.yellow.darker());
               }
               numberButtons[i].setFont(myFont);
               numberButtons[i].setFocusable(false);

               panel.add(numberButtons[i]);
            }
            panel.setBackground(Color.black.darker());
            jpanel_arr.add(panel);
            frame.add(panel);

         }
      }
      frame.getContentPane().setBackground(Color.lightGray);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

   public void set_Board(int initial_arr[]) {
      frame.getContentPane().removeAll();
      int index = 0;

      for (int a = 0; a < 3; a++) {
         for (int b = 0; b < 3; b++) {

            panel = new JPanel();

            panel.setBounds(b * 166 + 20, a * 166 + 20, 166, 166);
            panel.setLayout(new GridLayout(3, 3, 2, 2));
            panel.setBorder(BorderFactory.createLineBorder(Color.black.darker()));

            JButton[] numberButtons = new JButton[9];
            index = (b * 3) + (a * 3 * 3 * 3);
            for (int i = 0; i < 9; i++, index++) {
               if ((i % 3 == 0) && (i > 0)) {
                  index += 6;
               } else {
               }
               if (initial_arr[index] != 0) {
                  numberButtons[i] = new JButton(String.valueOf(initial_arr[index]));
                  numberButtons[i].setBackground(Color.green.brighter());
               } else {
                  numberButtons[i] = new JButton();
                  numberButtons[i].setBackground(Color.yellow.darker());
               }
               numberButtons[i].setFont(myFont);
               numberButtons[i].setFocusable(false);

               panel.add(numberButtons[i]);
            }
            panel.setBackground(Color.black.darker());
            frame.add(panel);

         }
      }
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}