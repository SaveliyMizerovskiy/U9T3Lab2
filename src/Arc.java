import java.awt.Graphics;


public class Arc extends Shape{
    private int arcAngle = 0;
    private int startAngle = 0;

    public Arc(){
        super();
        startAngle = 30;
        arcAngle = 70;
    }
    @Override
    public void draw(Graphics g){
        g.setColor(getColor());
        g.drawArc(getMinX(), getMinY(), getWidth(),getHeight(), startAngle, arcAngle);
    }
}
