import java.util.*;
public class Rotating_Array_Clockwise
{
    public static void Rotateme(int a[] , int n , int k){
        k=k%n;
        for(int i=1 ; i<=k ; i++){
            int temp=a[0];
            for(int j=0 ; j<n-1 ; j++){
                a[j]=a[j+1];
            }
            a[n-1]=temp;
        }
        for(int i=0 ; i<n ; i++){
            if(i==n-1){
                System.out.println(a[i]+"");
            }else{
                System.out.print(a[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number of Test Case :- ");
        int n=in.nextInt();
        for(int j=1 ; j<=n ; j++){
            System.out.print("Enter The Size of Array :- ");
            int s=in.nextInt();
            System.out.print("Enter The Time to Rotate :- ");
            int k=in.nextInt();
            int arr[]=new int[s];
            System.out.print("Enter The Element of Array :- ");
            for(int i=0 ; i<s ; i++){
                arr[i]=in.nextInt();
            }
            Rotateme(arr,s,k);
        }
        in.close();
    }
}