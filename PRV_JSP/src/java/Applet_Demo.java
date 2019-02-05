import java.awt.*;
import java.applet.*;

public class Applet_Demo extends Applet {
    public void paint(Graphics g) {
        setBackground(Color.red);
        setForeground(Color.CYAN);
        g.drawString("Hello", 20, 20);
    }
}
