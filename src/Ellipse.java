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
        this.p.setX(px);
        this.p.setY(py);
        this.semiAxysX = this.semiAxysY = 0;
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.semiAxysY = widthBB;
        this.semiAxysX = heightBB;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.c);
        g.fillOval(this.p.getX(),this.p.getY(), this.semiAxysY,this.semiAxysX);
    }
    /*-----------------------------------------------------------------*/
    protected int semiAxysX, semiAxysY;
}
