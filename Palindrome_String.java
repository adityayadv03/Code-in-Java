/*Author :- Aditya Yadav */
import java.util.*;
public class Palindrome_String //Program to Check whether a given string palindrome or not
{ //palindrome means the String after reversing will remain same
    public static boolean CheckPalindromeString(String str) //Function which check the String for palindrome and return true or false
    {
        for(int i=0 ; i<str.length()/2 ; i++) //traversing the String
        {
            if(str.charAt(i)!=str.charAt(str.length()-i-1)) //if the 1 character and last index is not same then the function return false and so on for the other i value
            {
                return false;
            }
        }
        return true; //If the Condition in the if block dont encounter then this statement will tell the user that the String is Palindromic
    }
    public static void main(String[] args) //Main Function
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String :- "); //Taking any String from User
        String str=in.nextLine();
        boolean ch=CheckPalindromeString(str); //Passing the String to the above function
        if(ch==true) //if the function return true then the string is palindromic
        {
            System.out.println("The String is Palindrome . ");
        }
        else //if the function return false then the string is Not palindrome
        {
            System.out.println("The String is not Palindrome . ");
        }
        in.close();
    }
}
