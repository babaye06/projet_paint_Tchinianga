import java.awt.*;

public class Square extends Rectangle
{
    public Square(){}

    public Square (int px, int py, Color c) {
        this.c = c;
        this.p.setY(py);
        this.p.setX(px);
        this.length = this.width = 0;
    }
    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.width=this.length=heightBB;
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(this.c);
        g.fillRect(this.p.getX(),this.p.getY(),this.width,this.length);
    }

    public void setLength (int l) { this.length = l;}

    public void setWidth (int w) { this.width = w; }
}
