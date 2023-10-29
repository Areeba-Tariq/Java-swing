import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class NewContact {
    List<Contact>ContactBook=new ArrayList<Contact>();
    private JPanel panel1;
    private JPanel leftPanel;
    private JPanel BottomPanel;
    private JPanel rightPanel;
    private JTextField nameField;
    private JTextField surnameField;
    private JTextField mobileno;
    private JTextField email;
    private JButton NewContact;
    private JButton NoOps;
    private JTextField FnameW;
    private JTextField MobileW;
    private JTextField EmailW;
    private JTextField SurNameW;

    public static void main(String[] args) {
        JFrame frame = new JFrame("NewContact");
        frame.setContentPane(new NewContact().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public NewContact() {
    FnameW.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    FnameW.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            super.keyTyped(e);
        }
    });

    NewContact.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ContactBook.add(new Contact(FnameW.getText(),SurNameW.getText(),MobileW.getText(),EmailW.getText()));
            JOptionPane.showMessageDialog(null,"Given name is "+ContactBook.get(0).getFname(),"Contact#1,",JOptionPane.PLAIN_MESSAGE);
        }
    });
}
}
