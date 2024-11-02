public class Palindrome_Exp {

    public static void main(String[] args) {
        
        String s = "MadaM";
        char [] chars = s.toCharArray();
        String reverse = "";

        for(int i = chars.length - 1; i >= 0; i--)
        {
            reverse = reverse + chars[i];
        }

        System.out.println(reverse);

        if(s.equals(reverse))
        {
            System.out.println("Given String is Palindrome");
        }
        else
        {
            System.out.println("Given String is not a Palindrome");
        }
    }
}
