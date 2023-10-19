import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        //jpanel=GUI component that functions as a container to hold other components

        ImageIcon icon=new ImageIcon("src//audiLogo.PNG");

        JLabel label=new JLabel();
        label.setText("hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(200,50,50,50);

        JPanel redpanel=new JPanel();
        redpanel.setBounds(0,0,250,250);
        redpanel.setBackground(Color.red);
        redpanel.setLayout(null);


        JPanel bluepanel=new JPanel();
        bluepanel.setBounds(250,0,250,250);
        bluepanel.setBackground(Color.blue);
        bluepanel.setLayout(null);

        JPanel greenpanel=new JPanel();
        greenpanel.setBounds(0,250,500,250);
        greenpanel.setBackground(Color.green);
        greenpanel.setLayout(null);



        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(700,700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);
        greenpanel.add(label);//panels are containers
    }
}