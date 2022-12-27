import java.lang.*;
import java.util.*;

/**
 * KeybRead
 */
public class KeybRead {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        s.useRadix(16);
        int x = s.nextInt();
        System.out.println(x);
    }
}