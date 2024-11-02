public class Even_Odd_Numbers_Ex2 extends Even_Odd_Numbers_Ex1{

    int b[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public void Odd_Number()
    {
        for(int c : b)
        {
            if(c % 2 != 0)
            {
                System.out.println(c);
            }
        }
    }

    public static void main(String[] args) {
        Even_Odd_Numbers_Ex2 obj = new Even_Odd_Numbers_Ex2();
        System.out.println("Even Numbers are: ");
        obj.Even_Number();
        System.out.println("Odd Numbers are: ");
        obj.Odd_Number();
    }
}
