import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        a = s.nextInt();
        b = s.nextInt();
        System.out.println("Before Swapping:");
        System.out.println("a=" + a + " and b=" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping:");
        System.out.println("a=" + a + " and b=" + b);
        s.close();
    }
}
