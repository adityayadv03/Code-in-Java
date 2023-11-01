/*Author :- Aditya Yadav */
import java.util.*;
public class Counting_Digit
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Any Number :- ");
        int n=in.nextInt();
        int count=0;
        while(n!=0)
        {
            count=count+1;
            n=n/10;
        }
        System.out.println("No of Digit in Given Number is :- "+count);
        in.close();
    }
}