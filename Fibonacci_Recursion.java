import java.util.*;
public class Fibonacci_Recursion
{
    public static int fib(int x)
    {
        if(x<=1)
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
        System.out.print("Enter the Limit :- ");
        int n=in.nextInt();
        System.out.print("Fibonacci Series :- ");
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(fib(i)+" ");
        }
        in.close();
    }
}
