import java.awt.*;

public class Ellipse extends Figure
{
    public Ellipse()
    {
        this.semiAxysX = this.semiAxysY =0;
    }

    public Ellipse(int px, int py, Color c)
    {
        this.c = c;
        this.x = px;
        this.y =py;
        this.semiAxysX=50;
        this.semiAxysY=100;
        Point p = new Point(px,py);

    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {}

    @Override
    public void draw(Graphics g) {
        g.setColor(this.c);
        g.fillOval(this.x,this.y,50,30);
    }
    /*-----------------------------------------------------------------*/
    protected int semiAxysX, semiAxysY;
}
