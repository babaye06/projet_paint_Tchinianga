import java.awt.*;

public class Circle extends Ellipse
{
    public Circle(){}

    public Circle(int px, int py, Color c)
    {
        this.c = c;
        this.x = px;
        this.y = py;
        this.semiAxysX = this.semiAxysY = 0;
    }
    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.semiAxysY = this.semiAxysX = heightBB;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.c);
        g.fillOval(this.x,this.y,this.semiAxysX,this.semiAxysY);
    }
}
