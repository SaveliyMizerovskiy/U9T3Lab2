import java.awt.*;


public class Line extends Shape{
    Point p1 = getP1();
    Point p2 = getP2();
    public Line(){
        super();
        p1 = getP1();
        p2 = getP2();

    }
    @Override
    public void draw(Graphics g){
        g.setColor(getColor());

        g.drawLine(p1.x,p1.y,p2.x,p2.y);
    }
}
