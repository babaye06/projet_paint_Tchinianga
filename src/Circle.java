import java.awt.*;

public class Circle extends Ellipse
{
    public Circle(){}

    public Circle(int px, int py, Color c)
    {
        this.c = c;
        this.p.setX(px);
        this.p.setY(py);
        this.semiAxysX = this.semiAxysY = 0;
    }
    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.semiAxysY = this.semiAxysX = heightBB;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.c);
        g.fillOval(this.p.getX(),this.p.getY(),this.semiAxysX,this.semiAxysY);
    }
}
