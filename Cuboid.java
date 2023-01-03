import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length, breadth, height;
        int totalArea, volume;
        System.out.println("Enter dimensions of cuboid");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();
        totalArea = 2 * ((length * breadth) + (breadth * height) + (length * height));
        volume = length * breadth * height;
        System.out.println("Total area is " + totalArea + " and volume is " + volume);
        sc.close();
    }
}
