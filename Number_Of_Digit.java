import java.util.*;
public class Number_Of_Digit
{
    public static void main(String[]args)
    {
        int co=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number :- ");
        int n=in.nextInt();
        while(n!=0)
        {
            co++;
            n/=10;
        }
        System.out.println("Number of Digit :- "+co);
        in.close();
    }
}
