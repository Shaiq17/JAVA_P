import java.awt.*;
import java.awt.event.*;

 class Pink {
    Frame f = new Frame("AWT pink");
    Label l;

    public Pink() {
        l = new Label("Hello java");
        l.setBounds(30, 60, 250, 30);
        l.setAlignment(Label.CENTER);
        l.setBackground(Color.PINK);
        f.add(l);
        f.setSize(300, 150);
        f.setLayout(null);
        f.setVisible(true);
        f.setBackground(Color.PINK);
        f.setForeground(Color.BLACK);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

     public static void main(String[] args) {
         new Pink();
     }

}
