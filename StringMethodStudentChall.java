public class StringMethodStudentChall {
    public static void main(String[] args) {
        String str="programmer@gmail.com";

        //find if id is on gmail or not. If yes print username and domain;

        if(str.matches("(.*)gmail(.*)"))
        {
            int i=str.indexOf("@");
            System.out.println("Username: "+str.substring(0,i));
            System.out.println("Domain: "+str.substring(i+1,str.indexOf(".com")));
        }
    }
}
