/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import entities.Coordinate;

/**
 *
 * @author Macbook
 */
public class CoordinateManager {

    private Coordinate coordinate;

    public CoordinateManager() {
        this.coordinate = new Coordinate(0,0) ;
    }
    

    public void rotate(double theta, double ox, double oy) {
        double tx = (coordinate.getX() - ox) * Math.cos(theta) - (coordinate.getY() - oy) * Math.sin(theta);
        double ty = (coordinate.getX() - ox) * Math.sin(theta) + (coordinate.getY() - oy) * Math.cos(theta);
        coordinate.setX(tx + ox);
        coordinate.setY(ty + oy);
    }
}
