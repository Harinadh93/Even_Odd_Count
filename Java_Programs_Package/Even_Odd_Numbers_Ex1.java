public class Even_Odd_Numbers_Ex1 {

    int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    public void Even_Number()
    {
        for(int c : a)
        {
            if(c % 2 == 0)
            {
                System.out.println(c);
            }
        }
    }
}