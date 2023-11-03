import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello my  world!");
        Handler h=new Handler();
        h.setContentPane(h.panel1);//very imp
        h.setVisible(true); //v.imp
        h.pack();
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}