import javax.swing.*;
public class HW_9 {
        public static void main(String[] args) {
            JFrame fr = new JFrame();
            fr.setSize(1000, 1000);
            fr.setTitle("Traffic light");
            fr.setVisible(true);
            HW9 abeer =new HW9();
            fr.add(abeer);
            fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }
    }

