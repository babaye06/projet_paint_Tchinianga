import java.awt.*;

public class Square extends Rectangle
{
    public Square(){}

    public Square (int px, int py, Color c) {
        Point p = new Point(px, py);
        this.c = c;
        this.x = px;
        this.y = py;
        this.length = 100;
        this.width = 100;
    }
    @Override
    public void setBoundingBox(int heightBB, int widthBB) {}

    @Override
    public void draw(Graphics g) {
        g.setColor(this.c);
        g.fillRect(this.x,this.y,this.width,this.length);
    }

    public void setLength (int l) { this.length = l;}

    public void setWidth (int w) { this.width = w; }
}
