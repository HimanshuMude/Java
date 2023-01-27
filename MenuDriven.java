import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        System.out.println("\t\tMenu");
        System.out.println("1)ADD\n2)SUB\n3)DIV\n4)MUL\n5)MOD");
        System.out.println("Enter 2 numbers");
        int a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        s.nextLine();
        System.out.println("Enter Operation");
        String op=s.nextLine();
        s.close();
        switch (op) {
            case "ADD":
                System.out.println(a+b);
                break;
            case "SUB":
                System.out.println(a-b);
                break;
            case "DIV":
                System.out.println(a/b);
                break;
            case "MUL":
                System.out.println(a*b);
                break;
            case "MOD":
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
