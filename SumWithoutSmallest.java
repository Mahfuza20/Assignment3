
import java.util.*;
public class SumWithoutSmallest{


    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x=sumWithoutSmallest(arr);
        System.out.println(x);
        sc.close();

    }

    public static int sumWithoutSmallest(int arr[]){
        int sum=0;
        Arrays.sort(arr);
        int minimum = arr[0];
        for(int i=1;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return (sum-minimum);
    }

}