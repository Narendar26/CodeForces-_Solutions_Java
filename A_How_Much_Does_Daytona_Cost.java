import java.util.*;
public class A_How_Much_Does_Daytona_Cost{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            ArrayList<Integer>a=new ArrayList<>();
            int n=sc.nextInt();
            int k=sc.nextInt();
            int []arr=new int[n];
            for(int j=0;j<arr.length;j++)
            {
                arr[j]=sc.nextInt();
            }
            for(int j=0;j<arr.length;j++)
            {
                a.add(arr[j]);
            }
            if(a.contains(k))
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
    
}