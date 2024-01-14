/*Author :- Aditya Yadav */
import java.util.*;
public class Palindrome_String //Program to Check whether a given string palindrome or not
{
    public static boolean CheckPalindromeString(String str)
    {
        for(int i=0 ; i<str.length()/2 ; i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String :- ");
        String str=in.nextLine();
        boolean ch=CheckPalindromeString(str);
        if(ch==true)
        {
            System.out.println("The String is Palindrome . ");
        }
        else
        {
            System.out.println("The String is not Palindrome . ");
        }
        in.close();
    }
}