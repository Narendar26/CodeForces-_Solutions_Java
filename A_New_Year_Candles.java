import java.util.*;
public class A_New_Year_Candles{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        while(a>0)
        {
            if(count%b==0){
                a++;
            }
            a--;
            count++;
        }
        System.out.println(count-1);

    }
}