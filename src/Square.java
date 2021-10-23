import java.awt.*;

public class Square extends Rectangle
{
    public Square(){}

    @Override
    public void setBoundingBox(int heightBB, int widthBB)
    {
        this.length = heightBB;
        this.width = widthBB;
    }

    @Override
    public void draw(Graphics g) {

    }

    public void setLength (int l) { this.length = l;}

    public void setWidth (int w) { this.width = w; }
}
