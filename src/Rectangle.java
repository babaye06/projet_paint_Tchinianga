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
       Point p = new Point(px, py);
       this.x = px;
       this.y=py;
       this.c = c;
       this.length =50;
       this.width = 150;
   }

   public int getPerimeter(Rectangle r )
   {
       int perimetre = 2 * (this.length + this.width);
       return perimetre;
   }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {}

    @Override
    public void draw(Graphics g)
    {
        g.setColor(this.c);
        g.fillRect(this.x,this.y,this.width,this.length);
    }

    /*-----------------------------------------------------------------*/

    protected int length,width;
}
