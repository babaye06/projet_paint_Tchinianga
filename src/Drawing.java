import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Drawing extends JPanel {
    Color c;
    ArrayList<Figure> list = new ArrayList<Figure>();
    String nameFigure;
    int x,y;

    public Drawing()
    {
        Rectangle rect = new Rectangle();
        list.add(rect);
    }

    public void setC(Color c) {this.c = c;}
    public void setNameFigure(String name) {this.nameFigure = name;}
}
