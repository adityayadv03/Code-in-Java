/*Author :- Aditya Yadav */
import java.util.*;
public class Reverse_words_in_string //Program to Reverse the Words Present in String
{
    public static String reverse(String str) //Function to reverse the words in the String
    {
        String s="",collect=""; //Two Variable one to store the require String and other to store one word at a time
        str=" "+str; //adding a space at start to terminate the require condition
        for(int i=str.length()-1 ; i>=0 ; i--) //traversing the string from backwards
        {
            if(str.charAt(i)==' ') //if the character present at i is space then adding the collected words to s
            {
                s+=collect+" ";
                collect="";
            }
            else //otherwise storing the character to collect variable
            {
                collect=str.charAt(i)+collect;
            }
        }
        return s; //Returning the String s
    }
    public static String removespace(String str) //Function to Remove Extra Space
    {
        String s=""; //Variable to Store the Required String
        for(int i=0 ; i<str.length() ; i++) //Running the loop to Traverse the String
        {
            if(str.charAt(i)!=' ') //Checking if the Character present at this position is a alphabet then Storing it in result
            {
                s+=str.charAt(i);
            }
            else if(str.charAt(i+1)!=' ') //if the first condition fail then it is other character and generally whitespace so we will check if the character present at i+1 is a alphabet then only the white space is added in result
            {
                s+=str.charAt(i);
            }
        }
        return s; //returning the String s
    }
    public static void main(String[] args) //The main Function to Take a Input and Call the Required Method
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Any String :- "); //Taking the Input From the User
        String str=in.nextLine();
        str=removespace(str); //Calling this Function to Remove all the Extra Space present in the String
        System.out.println("The New String :- "+reverse(str)); //Printing the Result Return by the function reverse()
        in.close();
    }
}
