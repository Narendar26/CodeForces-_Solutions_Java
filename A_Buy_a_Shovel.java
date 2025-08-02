import java.util.*;
public class A_Buy_a_Shovel{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int price=sc.nextInt();
        int r=sc.nextInt();
        if(price%10==0)
        {
            System.out.println(1);
            return;
        }
        else if(price%10==r)
        {
            System.out.println(1);
            return;
        }
        for(int i=2;i<=10;i++)
        {
            if((price*i)%10==0)
            {
                System.out.println(i);
                return;
            }
            else if((price*i)%10==r){
                System.out.println(i);
                return;
            }
        }
    }
}