import java.util.*;
public class B_Multiply_by_2_divide_by_6{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       for(int i=0;i<t;i++)
       {
        long n=sc.nextLong();
        int count=0;
          while(n>1)
          {
            if(n%2!=0)
            {
                if(n%3==0)
                {
                    n*=2;
                    count++;
                }
                else{
                    break;
                }
            }
            else{
                if(n%3==0)
                {
                   n/=6;
                   count++;
                }
                else{
                    break;
                }
            }
          }
          if(n==1)
          {
            System.out.println(count);
          }
          else{
            System.out.println(-1);
          }
       }
    }
}