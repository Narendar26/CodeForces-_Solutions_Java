import java.util.*;
public class A_Odd_Divisor{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            long l= sc.nextLong();
            if(l%2!=0)
            {
                System.out.println("YES");
            
            }
            else {
                
                    while(l%2==0)
                    {
                          l/=2;
                    }
                    if(l>1)
                    {
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                }
            }
        }
    }

