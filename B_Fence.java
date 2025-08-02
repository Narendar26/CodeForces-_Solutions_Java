import java.util.*;
public class B_Fence{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        long index=1;
        if(n==k)
        {
            System.out.println(index);
            return;
        }
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
             arr[i]=sc.nextInt();
        }
        long sum=0;
        for(int i=0;i<k;i++)
        {
           sum+=arr[i];
        }
        long min=Integer.MAX_VALUE;
        min=Math.min(min,sum);
        for(int i=k;i<arr.length;i++)
        {
            sum+=(arr[i]-arr[i-k]);
            if(sum<min){
               index=(i-k+2);
               min=sum;
            }    
        }
        System.out.println(index);
    }

}