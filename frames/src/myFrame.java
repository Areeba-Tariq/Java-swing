import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;


public class myFrame extends JFrame {
    myFrame() {
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(500, 500);

        this.setVisible(true);

        ImageIcon image = new ImageIcon("src//logo.PNG");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(123, 50, 250));///or write Color.green instead of rgb value
    }
}
