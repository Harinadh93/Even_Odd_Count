public class Reverse_String_Exp {

    public static void main(String[] args) {
        String s = "Sai Ashok";
        char [] chars = s.toCharArray();
        String reverse = " ";

        for(int i = chars.length - 1; i >= 0; i--)
        {
            reverse = reverse + chars[i];
        }
        System.out.println("The reverse String is: "+reverse);
    }
}
