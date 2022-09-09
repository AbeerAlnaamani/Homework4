import java.awt.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
public class HW9 extends JComponent {
    public void paintComponent(Graphics g) {
        Rectangle r = new Rectangle(200, 200, 90, 270);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK.brighter());
        g2.fill(r);
        g2.draw(r);

        Rectangle r1 = new Rectangle(240, 410, 10, 250);
        Graphics2D gr = (Graphics2D) g;
        gr.setColor(Color.BLACK.brighter());
        gr.fill(r1);
        gr.draw(r1);

        Ellipse2D.Double light = new  Ellipse2D.Double(210,210,70,70);
        g2.setColor(Color.RED.darker());
        g2.fill(light);

        Ellipse2D.Double light1 = new  Ellipse2D.Double(210,300,70,70);
        g2.setColor(Color.YELLOW.darker());
        g2.fill(light1);

        Ellipse2D.Double light2 = new  Ellipse2D.Double(210,390,70,70);
        g2.setColor(Color.GREEN.darker());
        g2.fill(light2);
    }
}
