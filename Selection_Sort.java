import java.util.*;
public class Selection_Sort
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number Of Element :- ");
        int n=in.nextInt();
        int arr[]= new int[n];
        System.out.print("Enter the Element :- ");
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=in.nextInt();
        }
        int min,temp;
        for(int i=0 ; i<n-1 ; i++)
        {
            min=i;
            for(int j=i+1 ; j<n ; j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println("After Sorting :- ");
        System.out.print("Element are :- ");
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
}
