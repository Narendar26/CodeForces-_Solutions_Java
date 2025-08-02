import java.util.*;
public class A_Submission_is_All_You_Need{
    public static void main(String args[])
    {  ArrayList<Integer>a=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
    
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int []arr=new int[n];
            
            for(int j=0;j<arr.length;j++)
            {
                arr[j]=sc.nextInt();
            }
            int count=0;
            int count1=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==0)
                {
                    count++;
                }
                else
                {
                    count1+=(arr[j]);
                }
            }
            if(count==0)
            {
                System.out.println(count1);
            }
            else{
                System.out.println(count1+count);
            }
        
        
            

    }
}
}