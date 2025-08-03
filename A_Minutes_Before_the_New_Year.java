import java.util.*;
public class A_Minutes_Before_the_New_Year{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
        int hr=sc.nextInt();
        int min=sc.nextInt();
        System.out.println(((24-hr)*60)-min);
        }
    }
    
}