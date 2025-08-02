import java.util.*;
public class A_cAPS_lOCK{
     public static void main(String args[])
     {
           Scanner sc=new Scanner(System.in);
           String s=sc.next();
           if(s.equals(s.toUpperCase()))
           {
                System.out.println(s.toLowerCase());
           }
           else if(Character.isLowerCase(s.charAt(0)))
           {
                if(s.substring(1).equals(s.substring(1).toUpperCase()))
                {
                    String t=Character.toUpperCase(s.charAt(0))+s.substring(1).toLowerCase();
                    System.out.println(t);
                }
                else
                {
                    System.out.println(s);
                }
           }
           else
           {
                System.out.println(s);
           }
     }
}