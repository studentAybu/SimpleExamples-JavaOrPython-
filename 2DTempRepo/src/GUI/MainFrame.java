package GUI;

import entities.Coordinate;
import entities.Shape2D;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 *
 * @author Macbook
 */
public class MainFrame extends JFrame {
    public MainPanel panel;
    public MainFrame(){
        panel = new MainPanel();
        this.setTitle("Graphics");
        this.add(panel);
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(255,255,255));
        this.setResizable(false);
        this.setSize(500,500);
        this.setVisible(true);
    }
}


