public class RegexStudentChall {
    public static void main(String[] args) {
        //find if a number is binary or not
        //find is a number is hexadecimal or not
        //find is the date format dd/mm/yyyy
        int n=15;
        String s1=String.format(Integer.toBinaryString(n));
        String s2=String.format(Integer.toHexString(n));
        String s3="02/06/2003";
        // System.out.println(s2);
        System.out.println(s1.matches("[01]*"));
        System.out.println(s2.matches("[0-9a-f]*"));
        System.out.println(s3.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
        
    }
}
