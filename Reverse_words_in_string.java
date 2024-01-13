/*Author :- Aditya Yadav */
import java.util.*;
public class Reverse_words_in_string //Program to Reverse the Words Present in String
{
    public static String reverse(String str)
    {
        String s="",collect="";
        str=" "+str;
        for(int i=str.length()-1 ; i>=0 ; i--)
        {
            if(str.charAt(i)==' ')
            {
                s+=collect+" ";
                collect="";
            }
            else
            {
                collect=str.charAt(i)+collect;
            }
        }
        return s;
    }
    public static String removespace(String str)
    {
        String s="";
        for(int i=0 ; i<str.length() ; i++)
        {
            if(str.charAt(i)!=' ')
            {
                s+=str.charAt(i);
            }
            else if(str.charAt(i+1)!=' ')
            {
                s+=str.charAt(i);
            }
        }
        return s;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Any String :- ");
        String str=in.nextLine();
        str=removespace(str);
        System.out.println("The New String :- "+reverse(str));
        in.close();
    }
}