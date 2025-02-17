
import GUI.MainFrame;
import business.CoordinateManager;
import business.Shape2DManager;
import entities.Coordinate;
import entities.Shape2D;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


public class Main {
public static void main(String[] args) {
        MainFrame a = new MainFrame();
        
        Shape2D shape2D = new Shape2D();
        CoordinateManager coordinateManager = new CoordinateManager();
        Shape2DManager shapeManager = new Shape2DManager(shape2D,coordinateManager);
        shapeManager.addVertex(new Coordinate(150,150));
        shapeManager.addVertex(new Coordinate(250,150));

        shapeManager.addVertex(new Coordinate(250,250));
        shapeManager.addVertex(new Coordinate(150,250));

        a.panel.addShape2D(shape2D);
        

        for(Shape2D el: a.panel.Shape2DList){

            for(Coordinate v: el.verticesList){

                System.out.println(v.getX()+" "+v.getY());
            }
        }
        shapeManager.calculateCenter();
        for(int i=0;i<3600;i++){

            shapeManager.rotateAroundPoint(shape2D.center,Math.PI/90);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            a.panel.repaint();
            for(Shape2D el: a.panel.Shape2DList){

                for(Coordinate v: el.verticesList){

                    System.out.println(v.getX()+" "+v.getY());
                }
            }
        }

    }


}
