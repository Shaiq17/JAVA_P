import java.awt.*;
import java.awt.event.*;

class Main4 implements MouseListener {
    Frame f = new Frame("AWT frame");
    Label l;
    Main4() {
        l = new Label();
        l.setBounds(30, 60, 250, 30);
        l.setAlignment(Label.CENTER);
        f.add(l);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.addMouseListener(this);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse clicked");
        f.setSize(300, 300);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse entered");
        f.setSize(900, 900);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
        f.dispose();
    }

    public static void main(String[] args) {
        new Main4();
    }
}
