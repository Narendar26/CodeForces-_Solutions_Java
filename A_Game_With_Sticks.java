import java.util.*;
public class A_Game_With_Sticks{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int rows=sc.nextInt();
       int col=sc.nextInt();
       int count=0;
       while(rows>0 && col>0)
       {
                rows-=1;
                col-=1;
                count++;
            
       }
       if(count%2!=0)
       {
        System.out.println("Akshat");

       }
       else{
        System.out.println("Malvika");
       }
   }
}