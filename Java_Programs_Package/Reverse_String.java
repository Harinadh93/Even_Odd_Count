public class Reverse_String {

    public static void main(String[] args) {
        String s = "Hari";
        char [] chars = s.toCharArray();
        String reverse = " ";

        for(int i = chars.length-1; i >= 0; i--)
        {
            reverse = reverse+chars[i];
        }
        System.out.println("Reverse String is: "+reverse);
    }
}
