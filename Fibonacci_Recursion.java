/*Author :- Aditya Yadav */
import java.util.*;
public class Fibonacci_Recursion //Code To Find Fibonacci Series
{
    public static int fib(int x) //Function to Find the ith Element of Series Using Recursion
    {
        if(x<=1) //Base Condition
        {
            return x;
        }
        else
        {
            return fib(x-1)+fib(x-2);
        }
    }
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Limit :- "); //Taking Input of Series length
        int n=in.nextInt();
        System.out.print("Fibonacci Series :- ");
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(fib(i)+" "); //Printing the Series
        }
        in.close();
    }
}
