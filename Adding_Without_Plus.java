import java.util.*;
public class Adding_Without_Plus
{
    public static int fun_to_add(int x,int y)
    {
        for(int i=1 ; i<=y ; i++)
        {
            x++;
        }
        return x;
    }
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number :- ");
        int a=in.nextInt();
        System.out.print("Enter Second Number :- ");
        int b=in.nextInt();
        System.out.println("Add :- "+fun_to_add(a,b));
        in.close();
    }
}
