import java.util.*;
public class A_Twins{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int []arr=new int[n];
       for(int i=0;i<arr.length;i++)
       {
        arr[i]=sc.nextInt();
       }
       long sum=0;
       for(int i=0;i<arr.length;i++)
       {
        sum+=arr[i];
       }
       int count=0;
       Arrays.sort(arr);
       long runsum=0;
       for(int i=arr.length-1;i>=0;i--)
       {
           runsum+=arr[i];
           if(runsum<=(sum-runsum))
              {
                count++;
              }
            else
            {
                System.out.println(count+1);
                break;
            }   

       }
    }
}