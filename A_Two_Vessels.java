import java.util.*;
public class A_Two_Vessels{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a==b){
                System.out.println(0);
                continue;
            }
            if((a+b)/2<=c){
                System.out.println(1);
            }
            else{
                   double p=Math.ceil((double)(a+b)/2);
                   double q=Math.abs(Math.min(a,b)-p);
                   double r=Math.ceil(q/c);
                   System.out.println((int)r);
            }
        }
    }
}