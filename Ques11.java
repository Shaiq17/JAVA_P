import java.awt.*;
import java.awt.event.*;

class Key_typed implements KeyListener {
    Frame f = new Frame("AWT keyboard");
    Label l;
    public Key_typed() {
        l = new Label("");
        l.setBounds(30, 60, 250, 30);
        l.setAlignment(Label.CENTER);
        f.add(l);
        f.setSize(350, 120);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        f.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        l.setText("Typed character is: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static void main(String[] args) {
        new Key_typed();
    }
}
