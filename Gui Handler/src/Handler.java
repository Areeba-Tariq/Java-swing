import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Handler extends JFrame {
    public JPanel panel1;
    private JPanel northPanel;
    private JPanel centerPanel;
    private JRadioButton boldbtn;
    private JRadioButton Italicbtn;
    private JRadioButton PlainBtn;
    private JCheckBox Boldchkbox;
    private JCheckBox italicchekbox;
    private JComboBox comboBox;
    private JTextField textField1;
    private static final String [] colors={"red","green","blue"};
public Handler() {
    ButtonGroup radioGroup = new ButtonGroup();
    radioGroup.add(PlainBtn);
    radioGroup.add(boldbtn);
    radioGroup.add(Italicbtn);
    boldbtn.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            textField1.setText("I am Bold Text");
            textField1.setFont(new Font(Font.SERIF,Font.BOLD,12));
        }
    });
    Italicbtn.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            textField1.setText("I am Italic Text");
            textField1.setFont(new Font(Font.SERIF,Font.ITALIC,12));
        }
    });
    PlainBtn.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            textField1.setText("I am Plain Text");
            textField1.setFont(new Font(Font.SERIF,Font.PLAIN,12));
        }
    });
    Boldchkbox.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            textField1.setText("I am boldchkbox Text");
            textField1.setFont(new Font(Font.SERIF,Font.BOLD,14));
        }
    });
    italicchekbox.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            textField1.setText("I am italicchekBox Text");
            textField1.setFont(new Font(Font.SERIF,Font.ITALIC,14));
        }
    });
    comboBox.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            textField1.setText(colors[comboBox.getSelectedIndex()]);
        }
    });
}
}
