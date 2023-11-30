import java.util.*;
public class Factorial_Recursion
{
    public static long fac(long x)
    {
        if(x==1 || x==0)
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
        System.out.print("Enter a Number :- ");
        long n=in.nextLong();
        System.out.println("Factorial :- "+fac(n));
        in.close();
    }
}
