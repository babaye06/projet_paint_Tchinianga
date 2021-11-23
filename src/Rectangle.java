import java.awt.*;

public class Rectangle extends Figure
{
    public Rectangle()
    {
        this.c = Color.BLUE;
        this.length = 15;
        this.width = 5;
    }

   public Rectangle (int px, int py, Color c)
   {
       this.p.setX(px);
       this.p.setY(py);
       this.c = c;
       this.length = this.width = 0;
       //System.out.println("Coordonné du point " +this.p.getX()+" "+this.p.getY());
   }

   public int getPerimeter(Rectangle r )
   {
       int perimetre = 2 * (this.length + this.width);
       return perimetre;
   }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.width = widthBB;
        this.length = heightBB;
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(this.c);
        g.fillRect(this.p.getX(),this.p.getY(),this.width,this.length);
    }


    /*-----------------------------------------------------------------*/

    protected int length,width;
}
