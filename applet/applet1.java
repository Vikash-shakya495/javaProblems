import javax.swing.*;
import java.awt.*;

public class applet1 extends JFrame {
    public applet1() {
        setTitle("java Machine");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Hello World", 20, 20);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            applet1 frame = new applet1();
            frame.setVisible(true);
        });
    }
}
