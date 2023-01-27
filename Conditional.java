import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Conditional {
    public static void main(String[] args) {
        // int a=5;
        // if(a%2==0) System.out.println("EVEN");
        // else System.out.println("ODD");

        // String str;
        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter a number");
        // str = s.nextLine();
        // if (str.matches("[01]+"))
        // System.out.println("Binary");
        // else if (str.matches("[0-7]+"))
        // System.out.println("Octal");
        // else if (str.matches("[0-9a-f]+"))
        // System.out.println("Hexa");
        // else
        // System.out.println("Not a number");

        // s.close();

        // Leap Year

        // int year;
        // Scanner s = new Scanner(System.in);
        // year = s.nextInt();
        // if ((year % 4 == 0 && year % 100 == 0 && year % 400 == 0) || (year % 4 == 0
        // && year % 100 != 0)) {
        // System.out.println("Leap Year");
        // } else {
        // System.out.println("Not a leap year");
        // }
        // s.close();

        // url parsing

        String url;
        Scanner s = new Scanner(System.in);
        url = s.nextLine();
        String protocol = url.substring(0, url.indexOf(":"));
        // System.out.println(protocol);
        String type = url.substring(url.indexOf(".") + 1);
        // System.out.println(type);
        if (protocol.equals("https"))
            System.out.println("Hyper Text Transfer Protocol Secure");
        else if (protocol.equals("ftp"))
            System.out.println("File Transfer Protocol");
        else if (protocol.equals("http"))
            System.out.println("Hyper Text Transfer Protocol");
        else
            System.out.println("Not a Valid Protocol");

        if (type.equals("com"))
            System.out.println("Commercial");
        else if (type.equals("gov"))
            System.out.println("Government");
        else if (type.equals("org"))
            System.out.println("Organization");
        else
            System.out.println("Other");

        s.close();
    }
}
