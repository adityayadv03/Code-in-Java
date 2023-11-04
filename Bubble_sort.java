/*Author :- Aditya Yadav */
import java.util.*;
public class Bubble_sort
{
    public static void main(String[]args)
    {
        int temp;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number Of Element :- ");
        int n=in.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the Element :- ");
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<n-1 ; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("Element Afer Sorting :- ");
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
}
