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
    JLabel TextoLogo;
    JLabel TextoCed;
    JLabel TextoPass;
    JLabel TextoOvi;
    JLabel TextoQr;
    ImageIcon Imagen1;
    ImageIcon Image2;
    ImageIcon Image3;
    ImageIcon Image4;
    JTextField InpCC;
    JTextField InpPass;
    JSeparator separador;
    JCheckBox BoxMostPass;
    JCheckBox BoxMantIni;
    JCheckBox BoxRecUsua;
    JButton BAtras;
    ClickAtras ClickAtras;

    public PantLogin() {

        this.setSize(1280, 720);
        this.setTitle("ISEM");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        getContentPane().setBackground(Color.DARK_GRAY);
        IniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void IniciarComponentes() {
        Panel();
        Imagenes();
        Textos();
        InputText();
        Separadores();
        checkbox();
        Botones();
        
    }

    public void Panel() {

        Panel = new JPanel();
        Panel.setBackground(Color.LIGHT_GRAY);
        Panel.setLayout(null);
        this.getContentPane().add(Panel);

    }

    public void Imagenes() {
        Label1 = new JLabel();
        Label2 = new JLabel();
        Label3 = new JLabel();
        Label4 = new JLabel();

        Imagen1 = new ImageIcon(getClass().getResource("/resourses/logo 1_1.png"));
        Label1.setBounds(850, 200, 184, 184);
        Label1.setIcon(new ImageIcon(Imagen1.getImage().getScaledInstance(Label1.getWidth(), Label1.getHeight(), Image.SCALE_DEFAULT)));
        Panel.add(Label1);

        Image2 = new ImageIcon(getClass().getResource("/resourses/logo cedula.png"));
        Label2.setBounds(142, 220, 40, 20);
        Label2.setIcon(new ImageIcon(Image2.getImage().getScaledInstance(Label2.getWidth(), Label2.getHeight(), Image.SCALE_DEFAULT)));
        Panel.add(Label2);
        
        Image3 = new ImageIcon(getClass().getResource("/resourses/qr.png"));
        Label3.setBounds(540,200,50,50);
        Label3.setIcon(new ImageIcon(Image3.getImage().getScaledInstance(Label3.getWidth(), Label3.getHeight(),Image.SCALE_DEFAULT )));
        Panel.add(Label3);
        
        Image4 = new ImageIcon(getClass().getResource("/resourses/candado.png"));
        Label4.setBounds(150, 420, 18, 22);
        Label4.setIcon(new ImageIcon(Image4.getImage().getScaledInstance(Label4.getWidth(), Label4.getHeight(), Image.SCALE_DEFAULT)));
        Panel.add(Label4);
          

    }

    public void Textos() {

        TextoLogo = new JLabel();
        TextoLogo.setText("LOGIN");
        TextoLogo.setFont(new Font("Stencil", NORMAL, 35));
        TextoLogo.setForeground(Color.BLACK);
        TextoLogo.setBounds(892, 285, 265, 265);
        Panel.add(TextoLogo);
        
        TextoCed = new JLabel();
        TextoCed.setText("Cedula de Ciudadania");
        TextoCed.setFont(new Font ("Stencil",NORMAL,15));
        TextoCed.setForeground(Color.BLACK);
        TextoCed.setBounds(130,50,255,300);
        Panel.add(TextoCed);
        
        TextoQr = new JLabel ();
        TextoQr.setText("<html>codigo<p>QR<html>");
        TextoQr.setFont(new Font("Stencil",NORMAL, 15));
        TextoQr.setBounds(600,205, 70,50);
        TextoQr.setForeground(Color.BLACK);
        Panel.add(TextoQr);
        
        TextoPass = new JLabel();
        TextoPass.setText("Contraseña");
        TextoPass.setFont(new Font ("Stencil",NORMAL,15));
        TextoPass.setForeground(Color.BLACK);
        TextoPass.setBounds(130,250,255,300);
        Panel.add(TextoPass);
        
        TextoOvi = new JLabel();
        TextoOvi.setText("olvide mi contraseña");
        TextoOvi.setBounds(200,450,255,255);
        TextoOvi.setFont(new Font("Stencil",NORMAL,15));
        TextoOvi.setForeground(Color.BLACK);
        Panel.add(TextoOvi);
    }
    
    public void InputText(){
        
        InpCC = new JTextField();
        InpCC.setBounds(190,220,300,25);
        InpCC.setFont(new Font ("Stencil",NORMAL,15));
        InpCC.setBackground(Color.LIGHT_GRAY);
        InpCC.setBorder(null);
        //InpCC.setBackground(Color.getHSBColor(208,254,180));
        //InpCC.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Panel.add(InpCC);
        
        InpPass = new JTextField();
        InpPass.setBounds(190,420,300,25);
        InpPass.setFont(new Font ("Stencil",NORMAL,15));
        InpPass.setBackground(Color.LIGHT_GRAY);
        InpPass.setBorder(null);
        Panel.add(InpPass);
        
    }
    public void Separadores(){
    
        separador = new JSeparator();
        separador.setBounds(120, 245, 400, 5);
        separador.setBackground(Color.BLACK);
        Panel.add(separador);
        
        separador = new JSeparator();
        separador.setBounds(120, 445, 400, 5);
        separador.setBackground(Color.BLACK);
        Panel.add(separador);
    }
    
    public void checkbox(){
    
        BoxRecUsua = new JCheckBox();
        BoxRecUsua.setText("recordar usuario");
        BoxRecUsua.setFont(new Font ("Stencil",NORMAL,15));
        BoxRecUsua.setBounds(100, 480, 175,15);
        BoxRecUsua.setBackground(Color.LIGHT_GRAY);
        Panel.add(BoxRecUsua);
        
        BoxMantIni = new JCheckBox();
        BoxMantIni.setText("<html>matener sesion<p>iniciada<html>");
        BoxMantIni.setFont(new Font ("Stencil",NORMAL,15));
        BoxMantIni.setBounds(350, 460, 175,50);
        BoxMantIni.setBackground(Color.LIGHT_GRAY);
        Panel.add(BoxMantIni);
        
        BoxMostPass = new JCheckBox();
        BoxMostPass.setBounds(520, 420, 15,15);
        BoxMostPass.setBackground(Color.LIGHT_GRAY);
        Panel.add(BoxMostPass);
        
    }
    
    public void Botones(){
        
        BAtras = new JButton();
        BAtras.setText("atras");
        BAtras.setFont(new Font("Stencil",NORMAL,15));
        BAtras.setBounds(10,10,80,40);
        BAtras.setBackground(Color.GRAY);
        BAtras.addMouseListener(ClickAtras);
        Panel.add(BAtras);
        
    }

}

class ClickAtras implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("asdfaefa");;
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
