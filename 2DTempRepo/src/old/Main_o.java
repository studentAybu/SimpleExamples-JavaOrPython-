package old;


import old.MainFrame_o;
import old.Coordinate_o;

public class Main_o {

    public static void main(String[] args) {
        MainFrame_o a = new MainFrame_o();
        Shape2D_o shape = new Shape2D_o();
        shape.addVertex(new Coordinate_o(150,150));
        shape.addVertex(new Coordinate_o(250,150));

        shape.addVertex(new Coordinate_o(250,250));
        shape.addVertex(new Coordinate_o(150,250));

        a.panel.addShape2D(shape);

        for(Shape2D_o el: a.panel.Shape2DList){

            for(Coordinate_o v: el.verticesList){

                System.out.println(v.x+" "+v.y);
            }
        }
        shape.calculateCenter();
        for(int i=0;i<3600;i++){

            shape.rotateAroundPoint(shape.center,Math.PI/90);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            a.panel.repaint();
            for(Shape2D_o el: a.panel.Shape2DList){

                for(Coordinate_o v: el.verticesList){

                    System.out.println(v.x+" "+v.y);
                }
            }
        }

    }
}