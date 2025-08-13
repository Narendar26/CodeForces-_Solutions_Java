import java.util.*;
public class C_Hard_Problem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            long m=sc.nextLong();
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long sum=0;
            long rem=0;
            if(m>=a && m>=b){
                sum+=(a+b);
                rem+=((m-a)+(m-b));
                if(rem>=c){
                    sum+=c;
                    System.out.println(sum);
                    continue;
                }
                else if(rem<c){
                    sum+=rem;
                    System.out.println(sum);
                    continue;
                }
               
            }
            else if(m>=a && m<b){
                sum+=((a+m));
                rem+=((m-a));
                if(rem<c){
                    sum+=rem;
                    System.out.println(sum);
                    continue;
                }
                else if(rem>=c){
                    sum+=c;
                    System.out.println(sum);
                    continue;
                }
            }
            else if(m<a && m>=b){
                sum+=(m+b);
                rem+=(m-b);
                if(rem<c){
                    sum+=rem;
                    System.out.println(sum);
                    continue;
                }
                else if(rem>=c){
                    sum+=c;
                    System.out.println(sum);
                    continue;
                }
            }
            else if(m<a && m<b)
            {
                 sum+=(2*m);
                 System.out.println(sum);
                 continue;

            }
            else if(m==a && m==b){
                  sum+=(a+b);
                  System.out.println(sum);
            }
        }
    }

}