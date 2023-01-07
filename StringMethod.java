public class StringMethod {
    public static void main(String[] args) {
        String s1="Java";
        String s2=s1.toLowerCase();//object created in the heap
        // System.out.println(s2);
        String s3="  Welcome  ";
        s3=s3.trim();//removes blank spaces

        // String s4=s3.substring(3,5); end is not inclusive

        // String s4=s3.replace('e', 'K');

        String s4="https://npmjs.com";
        
        
        // System.out.println(s4.endsWith(".com"));
        // System.out.println(s4.charAt(7));
        // System.out.println(s1.lastIndexOf('a'));
        // System.out.println(s4.indexOf('/',7));//not found return -1 else index

        String str1="hava";
        String str2="java";
        String str3="Python";
        String str4="Python";
        // System.out.println(str3.equals(str4));
        // System.out.println(str1.equalsIgnoreCase(str2));

        //if there are 2 objects holding the same references equals and == will give same result
        // == operator compares references
        String x="Java";
        String y=new String("Java");
        // System.out.println(x.equals(y)); //true
        // System.out.println(x==y); //false

        // System.out.println(str2.compareTo(str1));// compares strings in dictionary order returns difference between their ascii codes of first mismatced letters

    }
}
