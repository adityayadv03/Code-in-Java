/*Author :- Aditya Yadav */
import java.util.*;
public class Reversing_Array //Program to Reverse Any Array of Any Size
{
    public static void main(String[] args) //Main Function Performing the Logic on the given String
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array Size :- "); //Taking the Size of Array
        int n=in.nextInt();
        int arr[] = new int[n]; //Declaring the Array of That Size
        System.out.print("Enter The Element :- "); //Taking the Array Element
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=in.nextInt();
        }
        int temp; //Taking a Temporary to swap the Value 
        for(int i=0 ; i<n/2 ; i++) //Running the Loop till the Mid of the array to Save the iteration
        {
            temp=arr[i]; //Storing the Element Present in the first index and so on
            arr[i]=arr[n-i-1]; //Transfering the element present in last index and so on
            arr[n-i-1]=temp; //Transfering the Value of temp to last index and so on
        }
        System.out.print("Element After Reversing :- "); //Printing the Updated Array
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
}
