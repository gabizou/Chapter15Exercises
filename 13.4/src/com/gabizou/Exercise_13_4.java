package com.gabizou;
import java.awt.*;
import javax.swing.*;

public class Exercise_13_4 extends JFrame {


  public static void main(String[] args) {
    Exercise_13_4 frame = new Exercise_13_4();
    frame.setSize(300, 400);
    frame.setTitle("Exercise13_04");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }
  
  public Exercise_13_4() {
	    add(new MultiplicationTablePanel());
	  }
}
