package logic;

import persistence.Database;
import gui.*;
import java.util.Timer;
import java.util.TimerTask;
//@author kakar

public class index {

    public static void main(String[] args) {

        //Creacion de objetos\\
        PantCarga PantCarga = new PantCarga();
        PantInicio PantInicio = new PantInicio();
        Login login = new Login();
        Database DB = new Database();
        Prinsipal prinsipal = new Prinsipal();
        Register register = new Register();
        Timer tiempo = new Timer();
        
        
        

        //TimerTask intro\\
        TimerTask iniciar = new TimerTask() {
            @Override
            public void run() {
                PantInicio.setVisible(true);
                PantCarga.dispose();
            }
        };

        //Iniciar programa\\
        PantCarga.setVisible(true);
        tiempo.schedule(iniciar, 9500);
        

    }

}
