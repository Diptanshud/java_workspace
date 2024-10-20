import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public int getInput(String Message){
        System.out.println(Message);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Main m = new Main();
        Point p = new Point();
        while (true) {
            p.setX1(0);
            p.setY1(0);
            int x2 = m.getInput("Enter the value of x2");
            int y2 = m.getInput("Enter the value of y2");
            p.setX2(x2);
            p.setY2(y2);
            double distance = Math.sqrt(Math.pow((p.getX2() - p.getX1()), 2) + Math.pow((p.getY2() - p.getY1()), 2));
            System.out.println("Distance=" + distance);
            int x3 = m.getInput("Enter the value of x3");
            int y3 = m.getInput("Enter the value of y3");
            p.setX3(x3);
            p.setY3(y3);
            double d1 = Math.sqrt(Math.pow((p.getX3() - p.getX2()), 2) + Math.pow((p.getY3() - p.getY2()), 2));
            System.out.println("Distance=" + d1);
            break;
        }
    }
}
