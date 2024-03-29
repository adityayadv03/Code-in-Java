/*Author :- Aditya Yadav */
import java.util.*;
public class Pyramid_Pattern //Program to Print A Basic Pyramid Pattern
{
    public static void pyramid(int n) //Function To Print the Pattern For a Given Limit
    {
        for(int i=1 ; i<=n ; i++) //Loop For Each Row
        {
            for(int j=1 ; j<=n-i ; j++) //Loop For Each Column
            {
                System.out.print(" "); //Printing the Space so that the pyramid get its shape properly
            }
            for(int k=1 ; k<=2*i-1 ; k++)
            {
                System.out.print("*"); //Asterisk is printed to a odd number to get the perfect shape
            }
            System.out.println(); //For Changing Line
        }
    }
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Limit :- "); //Taking the Limit
        int n=in.nextInt();
        pyramid(n); //Calling The Require Function
        in.close();
    }
}
