import java.util.*;
public class Array_and_Function
{
    public static void display(int ar[] , int lim)
    {
        System.out.print("Element Of Array :- ");
        for(int i=0 ; i<=lim ; i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Limit :- ");
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            System.out.print("Enter The Element :- ");
            arr[i]=in.nextInt();
            display(arr,i);
        }
        in.close();
    }
}
