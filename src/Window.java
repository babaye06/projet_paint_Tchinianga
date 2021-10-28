import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class Window extends JFrame {

    public Window(String Title,int x,int y)
    {
        // Initialisation de la fenetre
        super(Title);
        this.setSize(x,y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPanel = this.getContentPane() ;

        // Gestion de la barre des menus

        //Creation de la barre
        JMenuBar m= new JMenuBar();

        //Création de 'File'
        JMenu menu1 = new JMenu("File");
        JMenuItem fnew = new JMenuItem("New");
        menu1.add(fnew);
        JMenuItem open = new JMenuItem("Open") ;
        menu1.add(open);
        JMenuItem save = new JMenuItem("Save") ;
        menu1.add(save);
        JMenuItem quit = new JMenuItem("Quit") ;
        menu1.add(quit);
        m.add(menu1);

        //Creation de 'A propos'
        JMenu menu2 = new JMenu("A propos");
        m.add(menu2);

        setJMenuBar(m);

        //Creation des boutons pour la couleur
        JButton noir= new JButton("Noir");
        JButton rouge = new JButton("Rouge");
        JButton vert = new JButton("Vert");
        JButton bleu = new JButton("Bleu");
        JButton jaune = new JButton("Jaune");
        JButton rose = new JButton("Rose");
        JButton magenta = new JButton("Magenta");
        JButton orange = new JButton("Orange");

        //Creation des boutons pour les figures
        JButton ellipse = new JButton("Elipse");
        JButton carre = new JButton("Carré");
        JButton rectangle = new JButton("Rectangle");
        JButton cercle = new JButton("Cercle");




        //Couleur des boutons
        noir.setOpaque(true);
        noir.setBackground(Color.BLACK);
        rouge.setOpaque(true);
        rouge.setBackground(Color.RED);
        vert.setOpaque(true);
        vert.setBackground(Color.GREEN);
        bleu.setOpaque(true);
        bleu.setBackground(Color.BLUE);
        jaune.setOpaque(true);
        jaune.setBackground(Color.YELLOW);
        rose.setOpaque(true);
        rose.setBackground(Color.PINK);
        magenta.setOpaque(true);
        magenta.setBackground(Color.MAGENTA);
        orange.setOpaque(true);
        orange.setBackground(Color.ORANGE);


        //Creation de la SouthPanel1
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(0,4));
        southPanel.add(noir);
        southPanel.add(rouge);
        southPanel.add(vert);
        southPanel.add(bleu);
        southPanel.add(jaune);
        southPanel.add(rose);
        southPanel.add(magenta);
        southPanel.add(orange);

        //Creation de la SouthPanel 2
        JPanel southPanel2 = new JPanel();
        southPanel2.setLayout(new GridLayout(0,2));
        southPanel2.add(ellipse);
        southPanel2.add(carre);
        southPanel2.add(rectangle);
        southPanel2.add(cercle);

        //Creation de la Panel princpal qui contien nos neux Jpannel
        JPanel Principal = new JPanel();
        Principal.setLayout(new GridLayout(1,2));
        Principal.add(southPanel);
        Principal.add(southPanel2);
        contentPanel.add(Principal,"South");

        this.setVisible(true);
    }
    public static void main (String args[])
    {
        Window win = new Window("Projet paint",800,600);
    }
}