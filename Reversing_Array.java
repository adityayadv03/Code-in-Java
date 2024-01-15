/*Author :- Aditya Yadav */
import java.util.*;
public class Reversing_Array //Program to Reverse Any Array of Any Size
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array Size :- ");
        int n=in.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter The Element :- ");
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=in.nextInt();
        }
        int temp;
        for(int i=0 ; i<n/2 ; i++)
        {
            temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.print("Element After Reversing :- ");
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
}
