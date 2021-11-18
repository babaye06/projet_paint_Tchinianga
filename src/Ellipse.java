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
        g.fillOval(this.x,this.y,this.semiAxysY,this.semiAxysX);
    }
    /*-----------------------------------------------------------------*/
    protected int semiAxysX, semiAxysY;
}
