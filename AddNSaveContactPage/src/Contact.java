import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Contact extends JFrame{
    public JPanel MainPanel;
    private JPanel westpanel;
    private JPanel eastpanel;
    private JPanel southpanel;
    private JLabel NameLabel;
    private JLabel SurnameLabel;
    private JLabel MobileLabel;
    private JLabel EmailLabel;
    private JTextField NameTextField;
    private JTextField EmailTextField;
    private JTextField SurnameTextField;
    private JTextField MobileTextField;
    private JButton AddBtn;
    private JButton NoOpBtn;

    public final static List<Contacts> listContacts=new ArrayList<>();
public Contact() {
    AddBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Contacts obj=new Contacts(NameTextField.getText(), SurnameTextField.getText(), MobileTextField.getText(), EmailLabel.getText() );
            listContacts.add(obj);
            JOptionPane.showMessageDialog(null,listContacts.get(0).getGivenname()," Contact#1",JOptionPane.PLAIN_MESSAGE);
        }
    });
    NameTextField.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });

    NameTextField.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            super.keyTyped(e);
        }
    });
}
}
