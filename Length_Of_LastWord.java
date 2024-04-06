//Author :- Aditya Yadav
import java.util.*;
public class Length_Of_LastWord{
    public static int findlastwordLength(String str){ //Function Finding the length of the last word
        int l=0,ans=0; //l to store the length of any word and ans to store the length or last word
        str=str.trim(); //Removing the extra space
        str=str+" "; //Adding a space to go with the condition
        char ch; //Storing the character at any instant
        for(int i=0 ; i<str.length() ; i++){ //Looping to traverse the string
            ch=str.charAt(i); //Extracting the character
            if(ch==' '){ //Checking the character to be a space if yes stroing the lenght of word to the answer
                ans=l;
                l=0; //Reseting the length to store the length of next word
            }else{ //if the char is other character than space adding to the length or word
                l++;
            }
        }
        return ans; //Returning the length as the last word is stored in the answer
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Any String :- "); //Taking a String
        String s=in.nextLine();
        in.close();
        int len=findlastwordLength(s); //Passing the string to function 
        System.out.println("The Length of Last Word :- "+len); //Displaying it to the terminal
    }
}