/*Author :- Aditya Yadav */
import java.util.*;
public class Bubble_sort //Code To Demostrate Bubble Sort Algorithms
{
    public static void main(String[]args)
    {
        int temp; //Create a Temporary Variable to Sort
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number Of Element :- "); //Taking the Size of Array From User
        int n=in.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the Element :- "); //Taking Input From the User
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0 ; i<n ; i++) //Sorting the Element 
        {
            for(int j=0 ; j<n-1 ; j++)
            {
                if(arr[j]>arr[j+1]) //Swapping the Two Element in Wrong Sequence
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("Element Afer Sorting :- "); //Printing The Sorted Element
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
}
