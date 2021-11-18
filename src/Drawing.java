import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Drawing extends JPanel implements MouseListener, MouseMotionListener {

    public Drawing() {
        list = new ArrayList<Figure>();
        nameFigure = "Rectangle";
        c = Color.BLACK;
        this.setBackground(Color.white);
        this.setSize(800,600);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void Clear()
    {
        list.clear();
        repaint();
    }

    public void setC(Color c) {this.c = c;}

    public void setNameFigure(String name) {this.nameFigure = name;}

    @Override
    public void mousePressed(MouseEvent e) {
        //System.out.println("Sourie préssée");
        x= e.getX();
        y = e.getY();

        switch (nameFigure) {
            case ("Rectangle"):
                this.list.add(new Rectangle(this.x, this.y, c));
                //System.out.println("Rectangle");
                //System.out.println(list);
                //repaint();
                break;
            case ("Cercle"):
                this.list.add(new Circle(this.x, this.y, c));
                //repaint();
                break;
            case ("Carre"):
                this.list.add(new Square(this.x, this.y, c));
                //repaint();
                break;
            case ("Ellipse"):
                this.list.add(new Ellipse(this.x, this.y, c));
                //repaint();
                break;
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //System.out.println("PaintComponent appelé");
        //g.fillRect(150,150,150,100);
        for (Figure f : this.list) {
            f.draw(g);
        }
    }

    public void save(){
        try
        {
            System.out.println("Methose save appelé");
            FileOutputStream fos = new FileOutputStream("sauveDessin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(list.size());
            for (Figure f : list)
            {
                oos.writeObject(f);
            }
            oos.close();
        }
        catch (Exception e)
        {
            System.out.println("Problème survenue");
        }
    }

    /*-----------------------------------------------------------------*/

    Color c;
    String nameFigure;
    int x,y,Xdrag,Ydrag,length,widht;
    ArrayList<Figure> list;

    @Override
    public void mouseDragged(MouseEvent e) {
        Xdrag = e.getX();
        Ydrag = e.getY();

        length=Math.abs(y-Ydrag);
        widht=Math.abs(x-Xdrag);

        list.get(list.size()-1).setBoundingBox(length,widht); //On prend le dernier element de la liste et on actualise sa BoundingBox
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
