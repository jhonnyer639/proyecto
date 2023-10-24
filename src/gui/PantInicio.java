package gui;

import gui.Register;
import gui.PantLogin;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PantInicio extends JFrame {

    JPanel Panel;
    JLabel LabeLog;
    JLabel LabelReg;
    JLabel Login;
    JLabel Register;
    ImageIcon Imagen1;
    ImageIcon Imagen2;
    PantLogin PLogin;
    ClickLog ClickLog;
    ClickReg ClickReg;

    public PantInicio() {

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
    }

    public void Panel() {

        Panel = new JPanel();
        Panel.setBackground(Color.getHSBColor(60, 28, 100));
        Panel.setLayout(null);
        this.getContentPane().add(Panel);

    }

    public void Imagenes() {

        LabeLog = new JLabel();
        LabelReg = new JLabel();
        Login = new JLabel();
        Register = new JLabel();
        ClickLog = new ClickLog();
        ClickReg = new ClickReg();

        Imagen1 = new ImageIcon(getClass().getResource("/resourses/logo 1_1.png"));
        LabeLog.setBounds(300, 180, 184, 184);
        LabeLog.setIcon(new ImageIcon(Imagen1.getImage().getScaledInstance(LabeLog.getWidth(), LabeLog.getHeight(), Image.SCALE_DEFAULT)));
        LabeLog.addMouseListener(ClickLog);
        Panel.add(LabeLog);

        Imagen2 = new ImageIcon(getClass().getResource("/resourses/logo 2_1.png"));
        LabelReg.setBounds(750, 180, 184, 184);
        LabelReg.setIcon(new ImageIcon(Imagen2.getImage().getScaledInstance(LabelReg.getWidth(), LabelReg.getHeight(), Image.SCALE_DEFAULT)));
        LabelReg.addMouseListener(ClickReg);
        Panel.add(LabelReg);

        Login.setText("LOGIN");
        Login.setBounds(315, 400, 150, 50);
        Login.setForeground(Color.getHSBColor(225, 225, 182));
        Login.setFont(new Font("Stencil", NORMAL, 25));
        Login.setHorizontalAlignment(SwingConstants.CENTER);
        Panel.add(Login);

        Register.setText("REGISTER");
        Register.setBounds(775, 400, 150, 50);
        Register.setForeground(Color.getHSBColor(225, 225, 182));
        Register.setFont(new Font("Stencil", NORMAL, 25));
        Register.setHorizontalAlignment(SwingConstants.CENTER);
        Panel.add(Register);
    }

}

class ClickLog implements MouseListener {

    PantLogin PLogin = new PantLogin();

    @Override
    public void mouseClicked(MouseEvent e) {
        PLogin.setVisible(true);

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

class ClickReg implements MouseListener {

    Register Register = new Register();

    @Override
    public void mouseClicked(MouseEvent e) {
        Register.setVisible(true);

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
