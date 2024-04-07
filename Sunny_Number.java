// Author:-Aditya Yadav
//Sunny Number is a Number is the number next to it is a perfect square example 80 is sunny number
import java.util.*;
public class Sunny_Number{ //Program to tell whether a given number is a Sunny or Not
    public static boolean isSquare(int n){ //Function to tell whether if the number is Perfect Square or Not
        boolean re=false;//Assuming the number is not a perfect square
        if(n!=0){ //if the number is not 0
            int ch=(int)Math.sqrt(n); // Calculating the square
            if((ch*ch)==n){ //if the number square is equal to the old number then changing assumtion to true
                re=true;
            }
        }
        return re; //Returning the value
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Any Number :- "); //Taking the Value from User
        int n=in.nextInt();
        if(isSquare(n+1)){ //Checking if the function return true or not for the next number of the entered number
            System.out.print(n+" is Sunny Number . ");
        }else{
            System.out.print(n+" is Not Sunny Number .");
        }
        in.close();
    }
}
