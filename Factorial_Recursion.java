/*Author :- Aditya Yadav */
import java.util.*;
public class Factorial_Recursion //Code To Find Factorial of First 20 Number 
{
    public static long fac(long x)//A Recursive Method To Find the Factorial
    {
        if(x==1 || x==0) //Base Condition
        {
            return 1;
        }
        else
        {
            return x*fac(x-1);
        }
    }
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number :- "); //taking Input
        long n=in.nextLong();//Using long to store as big number as possible
        System.out.println("Factorial :- "+fac(n)); //Printing the Return Factorial
        in.close();
    }
}
