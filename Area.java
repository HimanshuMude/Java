import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        float a, b, c;
        System.out.println("Enter sides of triangle");
        Scanner s = new Scanner(System.in);
        a = s.nextFloat();
        b = s.nextFloat();
        c = s.nextFloat();
        float semi = (a + b + c) / 2f;
        System.out.println("Semiperimeter is " + semi);
        double area = Math.sqrt(semi * (semi - a) * (semi - b) * (semi - c));
        System.out.println("The area is " + area);
        s.close();
    }
}
