import java.util.*;
public class B_Sale{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int []arr=new int[n];
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                a.add(arr[i]*-1);
            }
        }
        if(a.size()==0)
        {
            System.out.println(0);
            return;
        }
        Collections.sort(a);
        int sum=0;
        for(int i=a.size()-1;i>=0;i--)
        {
            if(m>0)
            {
                sum+=a.get(i);
                m--;
            }
        }
        System.out.println(sum);
    }

}