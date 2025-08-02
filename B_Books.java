import java.util.*;
public class B_Books{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long free=sc.nextLong();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=0;
        long sum=0;
        int left=0;
        int maxlen=0;
        for(int right=0;right<arr.length;right++)
        {
            sum+=arr[right];
            while(sum>free)
            {
                  sum-=arr[left];
                  left+=1;
            }
            maxlen=Math.max(maxlen,right-left+1);
        
        }
        System.out.println(maxlen);

        
        
    }

}