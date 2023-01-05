public class Printing {
    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println("Sum is " + x + y); // prints Sum is 1020
        System.out.println("Sum is " + (x + y));// prints Sum is 30

        System.out.println("Sum of " + x + " and " + y + " is " + (x + y)); // formatted output basic

        int a = 1023;
        float b = 13.99f;
        char c = 'H';
        String str = "Hola";

        System.out.printf("Hello %d %f %c %s World\n", a, b, c, str);
        System.out.printf("Hello %o %e %c %s World\n", a, b, c, str);
        System.out.printf("Hello %x %g %c %s World\n", a, b, c, str);

        // Argument index

        // General Syntax %[Argument index$][flag][width][.precision]conversion

        System.out.printf("%1$d %1$d %1$d\n", x);
        System.out.printf("%1$d %2$f %1$d\n", x, b);
        System.out.printf("%3$s %1$d %2$c", a, c, str);

        // flags and width

        int p = 10, q = -11;
        System.out.printf("%5d\n", p);
        System.out.printf("%05d\n", p);
        System.out.printf("%(5d\n", q);
        System.out.printf("%+5d\n", q);
        float f = 123.457f;
        System.out.printf("%6.2f\n", f);

        String s = "Java";
        System.out.printf("%10s\n", s);
        System.out.printf("%-10s\n", s);

        // printf and format works same

    }
}
