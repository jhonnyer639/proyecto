package gui;

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
    Login PLogin;

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

        Imagen1 = new ImageIcon(getClass().getResource("/resourses/logo 1_1.png"));
        LabeLog.setBounds(300, 180, 184, 184);
        LabeLog.setIcon(new ImageIcon(Imagen1.getImage().getScaledInstance(LabeLog.getWidth(), LabeLog.getWidth(), Image.SCALE_DEFAULT)));
        Panel.add(LabeLog);

        Imagen2 = new ImageIcon(getClass().getResource("/resourses/logo 2_1.png"));
        LabelReg.setBounds(750, 180, 184, 184);
        LabelReg.setIcon(new ImageIcon(Imagen2.getImage().getScaledInstance(LabelReg.getWidth(), LabelReg.getWidth(), Image.SCALE_DEFAULT)));
        LabelReg.addMouseListener(new MouseAdapter() {
            private void click(MouseAdapter evt) {
                Register(evt);
            }
        });
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

    private void Register(MouseAdapter evt) {

        PLogin.setVisible(true);
        this.dispose();
    }
}
