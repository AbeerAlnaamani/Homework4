import java.awt.*;
import java.util.Scanner;
public class HW1 {
        public static void main(String[] args) {
            int height, width;
            Scanner in=new Scanner(System.in);
            System.out.println("enter the height:");
            width= in.nextInt();
            System.out.println("enter the width:");
            height= in.nextInt();
            Rectangle r =new Rectangle(height,width);
            System.out.println("the perimeter of the rectangle ="+2*(r.getHeight()+ r.getWidth()));
            System.out.println("expected answer ="+2*(height+width));
        }
}
