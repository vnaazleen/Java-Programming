/*

Write a java program that simulates a traffic light. 
The program lets the user select one of three lights:red, yellow, or green with radio buttons. 
On selecting a button, an appropriate message with ”Stop” or”Ready” or ”Go” should appear above the buttons in selected color. 
Initially there is no message shown. 

*/

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class TrafficSignals extends JFrame implements ActionListener {
    JRadioButton red;
    JRadioButton orange;
    JRadioButton green;

    ButtonGroup lights;

    TrafficSignals () {
        red = new JRadioButton("Red");
        orange = new JRadioButton("Orange");
        green = new JRadioButton("Green");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(300, 100);

        lights = new ButtonGroup();

        red.addActionListener(this);
        orange.addActionListener(this);
        green.addActionListener(this);

        lights.add(red);
        lights.add(orange);
        lights.add(green);

        this.add(red);
        this.add(orange);
        this.add(green);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) { 
        if (ae.getSource()==red) {
            System.out.println("Stop!");
        } else if (ae.getSource()==orange) {
            System.out.println("Get ready!");
        } else {
            System.out.println("Go!");
        }
    } 
  
    public static void main(String[] args) {
        new TrafficSignals();
    }
}
