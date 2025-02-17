package old;

import old.Coordinate_o;
import java.util.ArrayList;

public class Shape2D_o {
    public ArrayList<Coordinate_o> verticesList;
    public Coordinate_o center;
    //Any transformation done to shape can also be done to center to get the new value of center.
    Shape2D_o(){
        verticesList = new ArrayList<>();
        center = new Coordinate_o(0,0); //Default value
    }
    public void calculateCenter(){
        int xcenter = 0;
        int ycenter = 0;
        for(Coordinate_o vertex: verticesList){
            xcenter+=vertex.x;
            ycenter+=vertex.y;
        }
        center.x = xcenter/verticesList.size();
        center.y = ycenter/verticesList.size();
    }
    public void addVertex(Coordinate_o... vertices){
        for(Coordinate_o vertex: vertices){
            verticesList.add(vertex);

        }
        calculateCenter();
    }
    public void rotateAroundCenter(double theta){
        rotateAroundPoint(this.center,theta);
    }
    public void rotateAroundPoint(Coordinate_o point, double theta){
        if(verticesList.isEmpty()){
            return;
        }
        center.rotate(theta,point.x,point.y);
        for(Coordinate_o vertex: verticesList){
            vertex.rotate(theta,point.x,point.y);
        }


    }
}
