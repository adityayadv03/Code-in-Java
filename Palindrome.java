/*Author :- Aditya Yadav */
import java.util.*;
public class Palindrome
{
    public static void CheckPalindrome(int num)
    {
        int Tocheck=num; //Storing the original Number To Check Afterward
        int rem,rev=0;
        while(num!=0) // Calculating Reverse Of Given Number
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==Tocheck) //Checking Whether reverse Number is Equal To Original Number Or Not 
        {
            System.out.println(Tocheck+" is a Palindrome Number . ");
        }
        else
        {
            System.out.println(Tocheck+" is not a Plaindrome Number . ");
        }
    }
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A Number To Check :- ");
        int n=in.nextInt();
        CheckPalindrome(n); // Function To Check The Number 
        in.close();
    }
}