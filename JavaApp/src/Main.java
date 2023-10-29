import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");

        JFrame frame=new JFrame("app");

        frame.setContentPane(new App().Mainpanel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}