import javax.swing.*;

public class HW_7 {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setSize(1000, 1000);
        fr.setTitle("The squares");
        fr.setVisible(true);
        HW7 abeer=new HW7();
        fr.add(abeer);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
