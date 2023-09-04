package logic;

import persistence.Database;
import gui.Login;
import gui.PantallaIni1;
import gui.Register;
import gui.Intro;
import gui.Prinsipal;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.Timer;
import java.util.TimerTask;
//@author kakar

public class index {

    public static void main(String[] args) {

        //Creacion de objetos\\
        Login login = new Login();
        Intro intro = new Intro();
        Database DB = new Database();
        Prinsipal prinsipal = new Prinsipal();
        PantallaIni1 inicio1 = new PantallaIni1();
        Register register = new Register();
        Timer tiempo = new Timer();

        //TimerTask intro\\
        TimerTask iniciar = new TimerTask() {
            @Override
            public void run() {
                prinsipal.setLocationRelativeTo(null);
                prinsipal.setVisible(true);
                intro.dispose();
            }
        };

        //Iniciar programa\\
        intro.setLocationRelativeTo(null);
        intro.setVisible(true);
        tiempo.schedule(iniciar, 10000);
        DB.conector();

    }

}
