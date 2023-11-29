/*Author :- Aditya Yadav */
import java.util.*;
public class Occurance_Of_Character //Code To Find Occurance of Character in String
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String :- "); //Taking String to Find for a Character
        String str=in.nextLine();
        System.out.print("Enter The Character :- "); //Taking a Character to Find
        char ch=in.next().charAt(0); //As Java Dont have .nextChar() so we use charAt(0) with inputing a word
        int count=0;
        for(int i=0 ; i<str.length() ; i++) //Checking with each character
        {
            if(str.charAt(i)==ch)
            {
                count++;
            }
        }
        System.out.println(ch+" Occur "+count+" Times . "); //Printing the Occurance
        in.close();
    }
}
