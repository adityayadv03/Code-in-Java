/*Author :- Aditya Yadav */
import java.util.*;
public class Reverse //Program To Reverse a Number Or String
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Any Number or String To Reverse :- "); //Taking Input From the User
<<<<<<< HEAD
        String string=in.nextLine();
        int length=string.length();
        String newstring=""; // Created a New String to Store the Solution
=======
        String str=in.nextLine();
        int length=str.length();
        String nstr=""; // Created a New String to Store the Solution
>>>>>>> 9f50d028d9bccc78b45af5e97bcf012195ed1fc3
        for(int i=0 ; i<length ; i++)
        {
            char ch=string.charAt(i); // Taking the First Character and storing it
            newstring=ch+newstring; // Adding the Character to the Starting of the String 
        }
        System.out.println("After Reversing :- "+newstring);
        in.close();
    }
}
