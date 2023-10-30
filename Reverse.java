/*Author :- Aditya Yadav */
import java.util.*;
public class Reverse //Program To Reverse a Number Or String
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Any Number or String To Reverse :- "); //Taking Input From the User
        String string=in.nextLine();
        int length=string.length();
        String newstring=""; // Created a New String to Store the Solution
        for(int i=0 ; i<length ; i++)
        {
            char ch=string.charAt(i); // Taking the First Character and storing it
            newstring=ch+newstring; // Adding the Character to the Starting of the String 
        }
        System.out.println("After Reversing :- "+newstring);
        in.close();
    }
}
