/*Author :- Aditya Yadav */
import java.util.*;
public class Rotating_Array_K_Times //Program to Find the New Array After K Rotation
{
    public static void reverse(int[] arr , int start , int end)
    {
        int temp;
        while(start<end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotateArray(int[] arr , int k)
    {
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Array Size :- ");
        int n=in.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the Element :- ");
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.print("Enter the Time to Rotate :- ");
        int r=in.nextInt();
        rotateArray(arr , r);
        System.out.print("Array Reversing :- ");
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
}
