public class Fibanacci_Series {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3;
        System.out.println("Fibanacci Series from 1 to 10");

        while(n2 <= 10)
        {
            System.out.print(n2 + " ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
