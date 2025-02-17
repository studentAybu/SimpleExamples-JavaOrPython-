package old;

public class Coordinate_o {
    public double x;
    public double y;
    Coordinate_o(double x, double y){
        this.x =x;
        this.y =y;
    }
    public void rotate(double theta, double ox, double oy){
        double tx = (x-ox)*Math.cos(theta)-(y-oy)*Math.sin(theta);
        double ty = (x-ox)*Math.sin(theta)+(y-oy)*Math.cos(theta);
        this.x = tx+ox;
        this.y = ty+oy;
    }

}
