package gui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;


public final class PantLogin extends JFrame {
    
    JPanel Panel;
    JLabel Label1;
    JLabel Label2;
    JLabel Label3;
    JLabel Label4;
    ImageIcon Imagen1;
    ImageIcon Image2;
    ImageIcon Image3;
    ImageIcon Image4;
    
    public PantLogin() {
        
        this.setSize(1280, 720);
        this.setTitle("ISEM");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        getContentPane().setBackground(Color.DARK_GRAY);
        IniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public void IniciarComponentes(){
        Panel();
        Imagenes();
        
    }
    
    public void Panel(){
    
        Panel = new JPanel();
        Panel.setBackground(Color.LIGHT_GRAY);
        Panel.setLayout(null);
        this.getContentPane().add(Panel);
        
    }
    
    public void Imagenes(){
    Label1 = new JLabel();
    Label2 = new JLabel();
    Label3 = new JLabel();
    Label4 = new JLabel();
    
    Imagen1 = new ImageIcon(getClass().getResource("/resourses/logo 1.png"));
    Label1.setBounds(500,500,184,184);
    Label1.setIcon(new ImageIcon(Imagen1.getImage().getScaledInstance(Label1.getWidth(),Label1.getHeight(), Image.SCALE_DEFAULT)));
    Panel.add(Label1);
    //Image2 = new ImageIcon(getClass().getResource("/resourses/qr.png"));
    //Panel.add(Label2);
    //Image3 = new ImageIcon(getClass().getResource("/resourses/Logo cedula.png"));
    //Panel.add(Label3);
    //Image4 = new ImageIcon(getClass().getResource("/resourses/candado.PNG"));
    //Panel.add(Label4);    
    
        
    }
    
}

class ClickAtraz implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
