public class StringJava {
    public static void main(String[] args) {
        // String is class in java
        // objects of this class can be made using char array byte array and String
        // literal

        char c[] = { 'A', 'B', 'C' };
        String s1 = new String(c);
        System.out.println(s1);

        byte b[] = { 65, 66, 67, 68 };// ascii in bytes
        String s2 = new String(b);
        System.out.println(s2);

        String s3 = "Java Lang";// create s3 and point it to string constant pool
        String s4 = new String("_Java");// 2 objects are created one in heap and the literal in string constant pool
        System.out.println(s3 + " " + s4);
        // If literal is same another copy is not created in pool
        // for creation with new keyword and object same as literal will be created in
        // heap

        String c1 = "Java";
        String c2 = "Java";

        String c3 = new String("Java");
        System.out.println(c1 == c2);//true
        System.out.println(c1 == c3);//false

        // String(char[] or byte[],start idx,length)
        String s5 = new String(c, 0, 2);
        String s6 = new String(b, 1, 2);
        System.out.println(s5 + " " + s6);

    }
}
