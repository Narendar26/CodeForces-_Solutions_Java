import java.util.*;
public class B_Blank_Space{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count++;
                max=Math.max(count,max);
            }
            else{
                count=0;
            }
        }
        if(max==Integer.MIN_VALUE)
        {
            System.out.println(0);
        }
        else{
            System.out.println(max);
        }
    }
}

    
}