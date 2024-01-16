/*Author :- Aditya Yadav */
import java.util.*;
public class Rotating_Array_K_Times //Program to Find the New Array After K Rotation
{
    public static void reverse(int[] arr , int start , int end) //Function to Reverse the Array
    {
        int temp; //Variable to Swap
        while(start<end) //Terminating Condition to run till the half of array
        {
            temp=arr[start]; //Storing the start index
            arr[start]=arr[end]; //Assigning the Value of end to the current index
            arr[end]=temp; //ReAssigning the Value of Temp to end 
            start++; //Incresing the Value of start
            end--; //Decreasing the Value of end
        }
    }
    public static void rotateArray(int[] arr , int k) //Function to Rotate the Array //Assuming a Array 1 2 3 4 5 and k 12
    {
        int n=arr.length; //Taking the Length or Array
        k=k%n; //Calculating the least Number of rotation by taking the Mod of k by n as after n rotation the array will be in its original state here the value of k will became 2 as 12 rotation will be equal to 2 rotation
        reverse(arr,0,n-k-1); //Reverse Function //After this Function the Array will look Like 3 2 1 4 5
        reverse(arr,n-k,n-1); //Reverse Function //After this Function the Array will look Like 3 2 1 5 4
        reverse(arr,0,n-1); //Reverse Function //After this Function the Array will look Like 4 5 1 2 3 This is the 12 Rotation of Array
    }
    public static void main(String[] args) //Function to Take the Array from User
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Array Size :- "); //Taking the Size of Array
        int n=in.nextInt();
        int arr[] = new int[n]; //Declaring the Array of n Size
        System.out.print("Enter the Element :- "); //Taking the Element Of Array
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.print("Enter the Time to Rotate :- "); //Taking the Value of k To Rotate The Array
        int r=in.nextInt();
        rotateArray(arr , r); //Calling Function to Rotate
        System.out.print("Array Reversing :- "); //Printing the Rotated Array
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
}
