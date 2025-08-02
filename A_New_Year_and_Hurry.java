import java.util.*;
public class A_New_Year_and_Hurry{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reach=sc.nextInt();
        int rem=240-reach;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(5*i<=rem)
            {
                count++;
                rem-=(5*i);
            }
        }
        System.out.println(count);

    }
}