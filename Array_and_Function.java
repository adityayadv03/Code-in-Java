/*Author :- Aditya Yadav */
import java.util.*;
public class Array_and_Function //Implement Basic Code Of Array With Functions
{
    public static void display(int ar[] , int lim) //Function to Display the Array
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
        System.out.print("Enter The Limit :- "); //Taking the Number Of Element for Array Size
        int n=in.nextInt();
        int arr[] = new int[n]; //Declaring Array
        for(int i=0 ; i<n ; i++)
        {
            System.out.print("Enter The Element :- ");
            arr[i]=in.nextInt(); //Taking Input
            display(arr,i); //Displaying the Element Present Till the Current Stage
        }
        in.close();
    }
}
