/*Author :- Aditya Yadav */
import java.util.*;
public class Selection_Sort //Code to Sort array Element Using Selection Sorting Technique
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number Of Element :- "); //Taking Array Size
        int n=in.nextInt();
        int arr[]= new int[n]; //Declaring array
        System.out.print("Enter the Element :- "); //Taking Array Element 
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=in.nextInt();
        }
        int min,temp;
        for(int i=0 ; i<n-1 ; i++) //Selection Sort Logic Block
        {
            min=i; //Assuming the Smallest element is in the first
            for(int j=i+1 ; j<n ; j++) //Checking whether Any Small Number is Present in Entire Array
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            temp=arr[min]; //Swapping the Smallest Number to First
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println("After Sorting :- ");
        System.out.print("Element are :- "); //Printing the Sorted array
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
}
