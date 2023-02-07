import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // table

        int k;
        System.out.println("Input a number ");
        Scanner s = new Scanner(System.in);
        k = s.nextInt();
        for (int i = 1; i <= 10; i++) {
        System.out.print((i * k) + " ");
        }

        // sum of n numbers

        int sum = 0;
        for (int i = 1; i <= k; i++) {
        sum += i;
        }
        System.out.println(sum);

        // factorial

        int fact = 1;
        for (int i = 1; i <= k; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }

}
