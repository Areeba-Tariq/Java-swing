import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class helloDemo extends JFrame{
    private JPanel panelMain;
    private JTextField txtName;
    private JButton btn;
public helloDemo() {
    btn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(btn,txtName.getText()+"Hello");
        }
    });
}

    public static void main(String[] args) {
    helloDemo h=new helloDemo();
    h.setContentPane(h.panelMain);
        // h.setTitle("hellossss");
    h.setBounds(600,200,200,200);
    h.setSize(300,400);
    h.setVisible(true);
    h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
