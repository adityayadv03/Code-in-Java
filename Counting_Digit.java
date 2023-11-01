/*Author :- Aditya Yadav */
import java.util.*;
public class Counting_Digit //Program to Count the Digit of Given Number
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Any Number :- ");
        int n=in.nextInt(); //Taking Input
        int count=0;
        while(n!=0) //Running Loop Till Number Become 0
        {
            count=count+1; //Counting Each Digit One by One
            n=n/10;
        }
        System.out.println("No of Digit in Given Number is :- "+count); //Printing The Calculated Digit
        in.close();
    }
}