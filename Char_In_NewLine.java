import java.util.*;
public class Char_In_NewLine
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Any String :- ");
        String str=in.nextLine();
        System.out.println("Character in NewLine :- ");
        for(int i=0 ; i<str.length() ; i++)
        {
            char ch=str.charAt(i);
            System.out.println(ch);
        }
        in.close();
    }
}