import java.util.*;
public class A_Beautiful_Year {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n+1;i<=10000;i++)
        {  HashSet<Integer>h=new HashSet<>();
            int p=i;
            boolean b=true;
            while(p>0)
            {
                if(h.contains(p%10))
                {
                    b=false;
                    break;
                }
                else{
                      h.add(p%10);
                }
                p/=10;

            }
            if(b){
                System.out.println(i);
                break;
            }
            
            
        }
    }
    
}
