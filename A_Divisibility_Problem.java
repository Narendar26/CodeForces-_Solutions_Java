import java.util.*;
public class A_Divisibility_Problem{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a<b)
            {
                System.out.println(b-a);
            
            }
            else if(a==b || a%b==0)
            {
                 System.out.println(0);
                 
            }
            else
            { 
                int n=a/b;
                System.out.println(b*(n+1)-a);
                
            }
        }
    }
}
