import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame  {

    JButton btn;
    MyFrame()
    {
        ImageIcon icon=new ImageIcon("src//logo.PNG");

        btn=new JButton();
        btn.setBounds(100,200,250,100);
        btn.addActionListener(e->System.out.println("jeeje"));//lamda expression
        btn.setFocusable(false);//coment this line to see difference(the boundry appears inside button text))
        btn.setIcon(icon);
        btn.setText("Im a button click me");
        btn.setHorizontalAlignment(JButton.CENTER);
        btn.setVerticalAlignment(JButton.CENTER);
        btn.setFont(new Font("Comic Sans",Font.BOLD,25));
        btn.setIconTextGap(10);
        btn.setForeground(Color.blue);
        btn.setBackground(Color.yellow);
        btn.setBorder(BorderFactory.createEtchedBorder());
        //btn.setEnabled(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        this.setSize(500,500);
        setLayout(null); //whenever you do setLayout(null)u have to setBounds of components
        add(btn);//always remember to do this
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==btn)
//        {
//            System.out.println("jijij");
//        }
//    }
}
