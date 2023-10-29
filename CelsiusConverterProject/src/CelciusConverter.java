import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelciusConverter  extends JFrame{
    private JPanel MainPanel;
    private JTextField CelsiusTextField;
    private JLabel CelsiusLabel;
    private JButton Btn;
    private JLabel FaranheitLabel;

    public CelciusConverter(String title)
    {
        this.setTitle(title);
        this.setContentPane(MainPanel);
        this.setVisible(true);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempFahr=(int)((Double.parseDouble(CelsiusTextField.getText()))*1.8+32);
                FaranheitLabel.setText(tempFahr+" F");
            }
        });
    }
}
