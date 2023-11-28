/*Author :- Aditya Yadav */
import java.util.*;
public class Number_Of_Digit //Program to Count the Digit in Given Number
{
    public static void main(String[]args)
    {
        int co=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number :- "); //Taking Number Of From User
        int n=in.nextInt();
        while(n!=0) //Running The Loop Till the Number become zero
        {
            co++; //Increasing the digit counter with the loop
            n/=10;
        }
        System.out.println("Number of Digit :- "+co); //Printing The Counted Digit
        in.close();
    }
}
