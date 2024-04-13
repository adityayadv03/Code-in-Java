import java.util.*;
public class numbersPat{
    public static void printPattern(int n){
        int j;
        for(int i=1 ; i<=n ; i++){
            for(j=1 ; j<=i ; j++){
                System.out.print(j);
            }
            for(int k=1 ; k<=2*(n-j+1) ; k++){
                System.out.print(" ");
            }
            for(int m=i ; m>=1 ; m--){
                System.out.print(m);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Limit :- ");
        int lim=in.nextInt();
        printPattern(lim);
        in.close();
    }
}