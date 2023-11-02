/*Author :- Aditya Yadav */
import java.util.*;
public class Char_In_NewLine
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Any String :- "); //Taken Input From User
        String str=in.nextLine();
        System.out.println("Character in NewLine :- ");
        for(int i=0 ; i<str.length() ; i++) //Covering Every Element Using Loop
        {
            char ch=str.charAt(i); //Storing Each Character
            System.out.println(ch); //Printing Each Character in New Line
        }
        in.close();
    }
}