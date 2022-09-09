import javax.swing.*;
import java.awt.*;
public class HW7 extends JComponent {
        public void paintComponent(Graphics g) {
            Rectangle r = new Rectangle(200, 200, 200, 200);
            Rectangle r1 = new Rectangle(500, 200, 200, 200);

            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.PINK);
            g2.fill(r);
            g2.draw(r);

            Graphics2D gr = (Graphics2D) g;
            gr.setColor(Color.MAGENTA.darker());
            gr.fill(r1);
            gr.draw(r1);
        }
}
