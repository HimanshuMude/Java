public class RegularExpression {
    public static void main(String[] args) {
        // String s1="a";
        // String s2="ab";
        // System.out.println(s1.matches("."));// . is regex for only 1 char
        // System.out.println(s2.matches("."));// . is regex for only 1 char
        // String s1="a",s2="q";
        // System.out.println(s1.matches("[abc]"));// returns true iff givem single char is among given regex exp
        // System.out.println(s2.matches("[abc]"));

        // String s1="q";
        // System.out.println(s1.matches("[^abc]"));
        // String s1="a",s2="%";
        // System.out.println(s1.matches("[a-z0-9]"));//char between a-z or 0-9
        // System.out.println(s2.matches("[a-z0-9]"));
        // String s1="a9",s2="c%";
        // System.out.println(s1.matches("[a-z][0-9]"));// for 2 characters comparison
        // System.out.println(s2.matches("[a-z][0-9]"));

        // String s1="a",s2="b";
        // System.out.println((s1.matches("a|x")));
        // System.out.println((s2.matches("a|x")));

        // String s1="abc",s2="bca";
        // System.out.println(s1.matches("abc"));//exact matching
        // System.out.println(s2.matches("abc"));

        //meta characters

        /* 
         *  \d ==digit
         * \D==Not digit
         * \s==sapce
         * \S==not space
         * \w==alphabet or digit
         * \W==Neighter alphabet nor digit
        */

        // String s="a";
        // System.out.println(s.matches("\\w"));// 2 slashes to state that its not an escape character
        // System.out.println(s.matches("\\d"));// 2 slashes to state that its not an escape character
        // System.out.println(s.matches("\\D"));// 2 slashes to state that its not an escape character
        // System.out.println(s.matches("\\W"));// 2 slashes to state that its not an escape character
        // System.out.println((" ").matches("\\s"));// 2 slashes to state that its not an escape character
        // System.out.println(s.matches("\\S"));// 2 slashes to state that its not an escape character

        //Quantifiers

        /*
         *  *==0 or more times 
         *   + one or more time
         *  ?== 0 or 1 time
         *  {x} x times
         *  {x,y} between x and y times
         */


        //  String s1="abcdef";
        //  System.out.println(s1.matches(".*"));
        //  String s2="abc12def";
        //  System.out.println(s1.matches("[a-z]*"));
        //  System.out.println(s2.matches("[a-z]*"));
        //  String s3="aabbccbbbcaa";
        //  System.out.println(s3.matches("[abc]*"));
        //  System.out.println(("abbcccd").matches("[abc]*"));
        //  String s4="";
        //  System.out.println(s4.matches("[abc]*"));
        //  System.out.println(s4.matches("[abc]+"));
        // String s5="acc";
        // System.out.println(s5.matches("[abc]{3}"));
        // System.out.println(s5.matches("[abc]{5}"));
        // String s6="abbbabbbc";
        // System.out.println(s6.matches("[abc]{3,7}"));


        //application

        // String em="himansh-u@gmail.com";
        // System.out.println(em.matches(".*gmail.com.*"));//general gmail check
        // System.out.println(em.matches("(\\w*)@gmail(.*)"));

    }
}
