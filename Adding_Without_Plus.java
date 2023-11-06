/*Author :- Aditya Yadav */
import java.util.*;
public class Adding_Without_Plus //Program to Add Two Number Without Using + operator
{
    public static int fun_to_add(int x,int y) //Function to Add Number returning the Modified Number
    {
        for(int i=1 ; i<=y ; i++) //Running The Loop To Second Number Times
        {
            x++;
        }
        return x;
    }
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number :- "); //Taking User From User
        int a=in.nextInt();
        System.out.print("Enter Second Number :- ");
        int b=in.nextInt();
        System.out.println("Add :- "+fun_to_add(a,b)); //Printing the Output
        in.close();
    }
}
