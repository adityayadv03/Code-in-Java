import java.util.*;
public class Star_Pattern_1
{
    public static void star(int n)
    {
        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Limit :- ");
        int n=in.nextInt();
        star(n);
        in.close();
    }
}
