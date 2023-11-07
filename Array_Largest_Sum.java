/*Author :- Aditya Yadav */
import java.util.*;
public class Array_Largest_Sum //Program to Find The Maximum Sum From Array Element
{
    public static void fun(int ar[] , int n) //Function to Rotate The Array
    {
        int temp=ar[0];
        for(int i=0 ; i<n-1 ; i++)
        {
            ar[i]=ar[i+1]; //Coping Every Element a index before
        }
        ar[n-1]=temp;
    }
    public static void main(String[] args)
    {
        int nmax=0,max=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Limit :- "); //Taking The Size of Array
        int n=in.nextInt();
        int arr[] = new int[n]; //Declaring the Array
        System.out.print("Enter The Element :- "); //Taking Input
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=in.nextInt();
        }
        for(int j=0 ; j<n ; j++)
        {
            fun(arr,n); //Rotating Array One Time to right
            nmax=arr[0]+arr[n-1]; //Calculating the Sum of first and last index
            if(nmax>max) //Checking if new Sum is greater than the max element
            {
                max=nmax;
            }
        }
        System.out.println("The Maximum Sum is :- "+max); //Printing the max element 
        in.close();
    }
}
