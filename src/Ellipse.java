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
        Point p = new Point(px,py);
        this.semiAxysX = this.semiAxysY =0;
    }


    @Override
    public void setBoundingBox(int heightBB, int widthBB)
    {
        this.semiAxysX = heightBB;
        this.semiAxysY = widthBB;
    }

    @Override
    public void draw(Graphics g) {
    }
    /*-----------------------------------------------------------------*/
    protected int semiAxysX, semiAxysY;
}
