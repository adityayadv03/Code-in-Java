/*Author :- Aditya Yadav */
import java.util.*;
public class Star_Pattern_1 //Program to Print A Basic Star Function
{
    public static void star(int n) //Function To Print the Pattern For a Given Limit
    {
        for(int i=1 ; i<=n ; i++) //Loop For Each Row
        {
            for(int j=1 ; j<=i ; j++) //Loop For Each Column
            {
                System.out.print("*");
            }
            System.out.println(); //For Changing Line
        }
    }
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Limit :- "); //Taking the Limit
        int n=in.nextInt();
        star(n); //Calling The Require Function
        in.close();
    }
}
