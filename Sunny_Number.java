// Author:-Aditya Yadav
//Sunny Number is a Number is the number next to it is a perfect square example 80 is sunny number
import java.util.*;
public class Sunny_Number{
    public static boolean isSquare(int n){
        boolean re=false;
        if(n!=0){
            int ch=(int)Math.sqrt(n);
            if((ch*ch)==n){
                re=true;
            }
        }
        return re;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Any Number :- ");
        int n=in.nextInt();
        if(isSquare(n+1)){
            System.out.print(n+" is Sunny Number . ");
        }else{
            System.out.print(n+" is Not Sunny Number .");
        }
        in.close();
    }
}
