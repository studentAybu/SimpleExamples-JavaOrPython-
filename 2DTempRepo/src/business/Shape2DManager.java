/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import entities.Coordinate;
import entities.Shape2D;

/**
 *
 * @author Macbook
 */
public class Shape2DManager {

    private Shape2D shape2D;
    private CoordinateManager coordinateManager;

    public Shape2DManager() {
    }
    
    

    public Shape2DManager(Shape2D shape2D, CoordinateManager coordinateManager) {
        this.shape2D = shape2D;
        this.coordinateManager = coordinateManager;
    }

    public void calculateCenter() {
        int xcenter = 0;
        int ycenter = 0;
        for (Coordinate vertex : shape2D.verticesList) {
            xcenter += vertex.getX();
            ycenter += vertex.getY();
        }
        shape2D.center.setX(xcenter / shape2D.verticesList.size());
        shape2D.center.setY(ycenter / shape2D.verticesList.size());
    }

    public void addVertex(Coordinate... vertices) {
        for (Coordinate vertex : vertices) {
            shape2D.verticesList.add(vertex);

        }
        calculateCenter();
    }

    public void rotateAroundCenter(double theta) {
        rotateAroundPoint(shape2D.center, theta);
    }

    public void rotateAroundPoint(Coordinate point, double theta) {
        if (shape2D.verticesList.isEmpty()) {
            return;
        }
        coordinateManager.rotate(theta, point.getX(), point.getY());
        for (Coordinate vertex : shape2D.verticesList) {
            coordinateManager.rotate(theta, vertex.getX(), vertex.getY());
           // coordinateManager.rotate(theta, point.getX(), point.getY()); //coordinateManager.rotate(theta, vertex.getX(), vertex.getY());
        }

    }
}
