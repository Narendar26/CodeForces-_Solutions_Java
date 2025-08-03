import java.util.*;
public class A_Vasya_and_Socks{
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int count=1;
        while(n>0){
         if(count%t==0){
            n++;
         }
         n--;
         count++;
        }
        System.out.println(count-1);
      }
}