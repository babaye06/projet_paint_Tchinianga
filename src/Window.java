import javax.swing.*;
import java.awt.*;

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

        //contentPanel.add(Noir);

        //Creation des boutons pour la couleur
        JButton noir= new JButton("Noir");
        JButton rouge = new JButton("Rouge");
        JButton vert = new JButton("Vert");
        JButton bleu = new JButton("Bleu");
        JButton jaune = new JButton("Jaune");
        JButton rose = new JButton("Rose");
        JButton magenta = new JButton("Magenta");
        JButton orange = new JButton("Orange");

        noir.setBackground(Color.BLACK);
        rouge.setBackground(Color.RED);
        vert.setBackground(Color.GREEN);
        bleu.setBackground(Color.BLUE);
        jaune.setBackground(Color.YELLOW);
        rose.setBackground(Color.PINK);
        magenta.setBackground(Color.MAGENTA);
        orange.setBackground(Color.ORANGE);



        //Creation de la SouthPanel
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(0,6));
        southPanel.add(noir);
        southPanel.add(rouge);
        southPanel.add(vert);
        southPanel.add(bleu);
        southPanel.add(jaune);
        southPanel.add(rose);
        southPanel.add(magenta);
        southPanel.add(orange);

        contentPanel.add(southPanel,"South");
/*
        JPanel southPanel2 = new JPanel();
        southPanel2.setLayout(new GridLayout(10,30));
        JButton elipse = new JButton("Elipse");
        southPanel2.add(elipse);

        contentPanel.add(southPanel2,"North");
*/






        this.setVisible(true);
    }
    public static void main (String args[])
    {
        Window win = new Window("Projet paint",800,600);
    }
}