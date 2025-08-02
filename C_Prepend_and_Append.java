import java.util.*;
public class C_Prepend_and_Append{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            String s=sc.next();
            int left=0;
            int right=n-1;
            while(left<right)
            {
                if(s.charAt(left)!=s.charAt(right))
                {
                     left++;
                     right--;
                }
                else{
                    break;
                }
            }
            if(left==right)
            {
                System.out.println(1);
            }
            else if(left>right)
            {
                System.out.println(0);
            }
            else{
                System.out.println(right-left+1);
            }

        }
    }
    
}