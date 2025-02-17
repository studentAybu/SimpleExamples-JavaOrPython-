/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author Macbook
 */
public class Shape2D {

    public ArrayList<Coordinate> verticesList;
    public Coordinate center;

    public Shape2D() {
        verticesList = new ArrayList<>();
        center = new Coordinate(0, 0); //Default value
    }
}
