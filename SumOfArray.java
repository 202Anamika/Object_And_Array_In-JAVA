import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args)
    {
        int arr[]=new int[5];
        int sum=0;
        Scanner r=new Scanner(System.in);

        System.out.print("Enter Elements of Array ");
        for(int i=0;i<arr.length;i++)
        {
        arr[i]=r.nextInt();
        }
        System.out.println("Array Elements ");

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            sum=arr[i]+sum;
        }
        System.out.print("Addition of Elements "+sum);
    }
}
