/*Author :- Aditya Yadav */
import java.util.*;
public class Array_Largest_Sum_2 //Program to Find The Maximum Sum From Array Element
{
    public static void main(String[] args)
    {
        int seclargest=0,largest=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Limit :- "); //Taking The Size of Array
        int n=in.nextInt();
        int arr[] = new int[n]; //Declaring the Array
        System.out.print("Enter The Element :- "); //Taking Input
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=in.nextInt();
            if(arr[i]>largest) //Modifing the Value of largest According to Given Condition
            {
                seclargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>seclargest && arr[i]!=largest) //Modifing the Second largest if the First Condtion Dont Hit
            {
                seclargest=arr[i];
            }
        }
        largest=largest+seclargest;
        System.out.println("The Maximum Sum is :- "+largest); //Printing the largest element 
        in.close();
    }
}
