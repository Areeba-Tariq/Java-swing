public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        Contact c=new Contact();
        c.setContentPane(c.MainPanel);
        c.setDefaultCloseOperation(3);
        c.setTitle(" My Contact Form");
        c.pack();
        c.setVisible(true);

    }
}