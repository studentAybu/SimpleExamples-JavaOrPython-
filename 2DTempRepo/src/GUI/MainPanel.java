/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import entities.Coordinate;
import entities.Shape2D;
import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Macbook
 */
public class MainPanel extends JPanel {//public class or class
    public ArrayList<Shape2D> Shape2DList;
    
    MainPanel(){
        this.setSize(new Dimension(500,500));
        Shape2DList = new ArrayList<>();
    }
    public void addShape2D(Shape2D object){
        Shape2DList.add(object);
    }
    public void construct2D(Graphics2D graphics){

        for(int i=0;i<Shape2DList.size();i++){
            Shape2D shape = Shape2DList.get(i);
            for(int j=0;j<shape.verticesList.size()-1;j++){

                graphics.drawLine((int)shape.verticesList.get(j).getX(),(int)shape.verticesList.get(j).getY(),(int)shape.verticesList.get(j+1).getX(),(int)shape.verticesList.get(j+1).getY());
            }
            Coordinate lastCoordinate = shape.verticesList.get(shape.verticesList.size()-1);
            graphics.drawLine((int)shape.verticesList.get(0).getX(),(int)shape.verticesList.get(0).getY(),(int)lastCoordinate.getX(),(int)lastCoordinate.getY());
        }
    }
    public void paint(Graphics d){
        Graphics2D g = (Graphics2D) d;
        g.setStroke(new BasicStroke(5));
        construct2D(g);
    }

}
