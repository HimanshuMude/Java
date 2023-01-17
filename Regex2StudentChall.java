public class Regex2StudentChall {
    public static void main(String[] args) {
        //Remove special char from string
        //remove extra spaces from string
        //find number of words in a string
        String s1="aBc@%12!3";
        s1=s1.replaceAll("\\W","" );
        System.out.println(s1);
        String s2="abc  de";
        s2=s2.replaceAll("\\s+"," ");
        System.out.println(s2);
        

    }
}
