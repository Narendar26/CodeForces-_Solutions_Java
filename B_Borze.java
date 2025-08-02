import java.util.*;
public class B_Borze{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i)=='.')
            {
                sb.append(0);
                i++;
                continue;
            
            }
            else if(s.charAt(i)=='-')
            {
                if(i+1<=s.length()-1)
                {
                    if(s.charAt(i+1)=='-')
                    {
                        sb.append(2);
                        i+=2;
                        continue;
                    }
                    else if(s.charAt(i+1)=='.')
                    {
                        sb.append(1);
                        i+=2;
                        continue;
                    }
                    
                    
                }

            }
            
        }
        System.out.println(sb.toString());

    }
    
}