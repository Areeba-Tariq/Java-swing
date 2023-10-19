import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Jlabel is GUI display area for string of text,image or both


        JLabel label=new JLabel();
        label.setText("Hello bro, preping for scd mid");

        ImageIcon icon=new ImageIcon("src//teslaLogo.PNG");
        Border border=BorderFactory.createLineBorder(Color.GREEN,3);
        label.setIcon(icon);

        label.setHorizontalTextPosition(JLabel.CENTER); //setting text relative to img
        label.setVerticalTextPosition(JLabel.TOP);//setting text relative to img
        label.setForeground(Color.CYAN);
        label.setFont(new Font("MV Boli",Font.PLAIN,20));//set font of text
        label.setIconTextGap(10); //set gap of text to image
        label.setBackground(Color.BLACK);
        label.setOpaque(true);//display the background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//set Veritical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon+text  within label
       // label.setBounds(100,0,250,250);

        JFrame frame=new JFrame();
        frame.setVisible(true);
        //frame.setLayout(null);//default is borer layout---as i passes null so i have to set the bounds of label(where i wnt to place the label--(the coordinates))
       // frame.setSize(500,500);
        //frame.setContentPane(label); //now label is all over Jframe
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.pack();//first write .add(label) then use .pack() otherwise wont work


        //so if i want to automatically fit the frame(window) according to compoenets in them use frame.pack() and comment the .setsize and .setLayout and .setBounds
    }
}