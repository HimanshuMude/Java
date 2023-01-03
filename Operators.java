import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float base, height, area;
        System.out.println("Enter Base and Height ");
        base = s.nextFloat();
        height = s.nextFloat();
        area = (base * height) / 2f;
        System.out.println("Area is " + area);
    }
}
