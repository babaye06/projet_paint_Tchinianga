import java.awt.*;

public class Rectangle extends Figure
{
    public Rectangle()
    {
        this.length = this.width = 0;
    }

   public Rectangle (int px, int py, Color c) {
       Point p = new Point(px, py);
       this.c = c;
       this.length = this.width = 0;
   }

   public int getPerimeter(Rectangle r )
   {
       int perimetre = 2 * (this.length + this.width);
       return perimetre;
   }


    @Override
    public void setBoundingBox(int heightBB, int widthBB) {}

    @Override
    public void draw(Graphics g) {}
    /*-----------------------------------------------------------------*/

    protected int length,width;
}
