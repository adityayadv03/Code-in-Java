import java.util.*;
public class Occurance_Of_Character
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String :- ");
        String str=in.nextLine();
        System.out.print("Enter The Character :- ");
        char ch=in.next().charAt(0);
        int count=0;
        for(int i=0 ; i<str.length() ; i++)
        {
            if(str.charAt(i)==ch)
            {
                count++;
            }
        }
        System.out.println(ch+" Occur "+count+" Times . ");
        in.close();
    }
}