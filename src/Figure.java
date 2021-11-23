import javax.swing.*;
import java.awt.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public abstract class Figure implements Serializable
{
    public abstract void setBoundingBox (int heightBB, int widthBB);

    public abstract void draw (Graphics g);

    public Color getC()
    {
        return c;
    }

    public void setP(int px, int py) {
        this.p.setX(px);
        this.p.setY(py);
    }

    public Figure(java.awt.Color c, Point p) {}

    public Figure(){}

    @Override
    public String toString() {
        return "Figure de couleur" + c;
    }

    /*-----------------------------------------------------------------*/

    protected Color c;
    protected Point p = new Point();
}
