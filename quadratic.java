import java.util.Scanner;

public class quadratic {
    public static void main(String[] args) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter coeffs");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        double d = Math.sqrt((b * b) - (4 * a * c));
        double r1, r2;
        r1 = (-b + d) / (2f * a);
        r2 = (-b - d) / (2f * a);
        System.out.println("The roots are: " + r1 + " " + r2);
        s.close();
    }
}
