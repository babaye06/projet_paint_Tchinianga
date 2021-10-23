import java.awt.*;

public class Circle extends Ellipse
{
    public Circle(){}


    @Override
    public void setBoundingBox(int heightBB, int widthBB)
    {
        this.semiAxysX = heightBB;
        this.semiAxysY = widthBB;
    }

    @Override
    public void draw(Graphics g) {
    }
}
