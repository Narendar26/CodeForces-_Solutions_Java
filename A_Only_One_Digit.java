import java.util.*;
public class A_Only_One_Digit{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int x=sc.nextInt();
            HashSet<Integer>h=new HashSet<>();
            while(x>0)
            {
                h.add(x%10);
                x/=10;

            }
            for(int k=0;k<=9;k++)
            {
                if(h.contains(k))
                {
                    System.out.println(k);
                    break;
                }
            }
        }
    }

}