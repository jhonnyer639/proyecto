package gui;

import java.awt.*;
import javax.swing.*;

public class PantCarga extends JFrame {

    JPanel Panel;
    JLabel Label;
    ImageIcon Imagen;

    public PantCarga() {

        this.setSize(1280, 720);
        this.setTitle("ISEM");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        this.getContentPane().setBackground(Color.darkGray);
        IniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void IniciarComponentes() {
        Panel();
        Animation();

    }

    public void Panel() {

        Panel = new JPanel();
        Panel.setBackground(Color.LIGHT_GRAY);
        Panel.setLayout(null);

        this.getContentPane().add(Panel);
    }

    public void Animation() {

        Label = new JLabel();
        Imagen = new ImageIcon(getClass().getResource("/resourses/A50%.gif"));
        Label.setBounds(0, 0, 1280, 720);
        Label.setIcon(new ImageIcon(Imagen.getImage().getScaledInstance(Label.getWidth(), Label.getHeight(), Image.SCALE_DEFAULT)));

        Panel.add(Label);

    }
}
