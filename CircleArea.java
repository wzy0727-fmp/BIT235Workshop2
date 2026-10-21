import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        
        double area = PI * Math.pow(r,2);
        System.out.println("Circle Area = " + area);
        sc.close();
    }
}
