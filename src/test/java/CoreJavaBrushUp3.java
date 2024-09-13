public class CoreJavaBrushUp3 {
    public static void main(String[] args) {
        //String is an Object that represents sequence of characters
        //String s1 = "Shubham S Choudhury";
        //new keyword to explicitly create a space in java memory
        String s2 = new String("Welcome to Core Java");
        String s3 = new String("Welcome to Core Java");

        String s = "Shubham Shibdas Choudhury";
        String[] splittedString = s.split("Shibdas");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1].trim());

        int i;
        for(i=0; i<s.length(); i++)
        {
            System.out.println(s.charAt(i));
            System.out.println("---------------------------------------");
        }
        //String in reverse order
        for(i=s.length()-1; i>=0; i--)
        {
            System.out.println(s.charAt(i));
        }
    }
}
