import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Buttons {
    Frame f = new Frame("AWT BUTTONS");
    Button b1, b2;
    public Buttons() {
        b1 = new Button("Red");
        b2 = new Button("Blue");
        b1.setBounds(50, 50, 250, 30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setBackground(Color.red);
            }
        });
        b2.setBounds(50, 100, 250, 30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setBackground(Color.BLUE);
            }
        });
        f.add(b1);
        f.add(b2);

        f.setSize(350, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

    }

    public static void main(String[] args) {
        new Buttons();
    }
}
