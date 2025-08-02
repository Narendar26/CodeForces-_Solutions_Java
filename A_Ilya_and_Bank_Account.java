import java.util.*;
public class A_Ilya_and_Bank_Account{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        if(n>=0)
        {
           System.out.println(n);
        }
        else{
            String s=String.valueOf(n);
            String s1=s.substring(0,s.length()-1);
            String s2=s.substring(0,s.length()-2)+s.substring(s.length()-1);
            long l1=Long.parseLong(s1);
            long l2=Long.parseLong(s2);
            long max=Math.max(n,Math.max(l1,l2));
            System.out.println(max);
        }
     }
    
}