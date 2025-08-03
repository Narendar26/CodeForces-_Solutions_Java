import java.util.*;
public class A_Make_it_White{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            String s=sc.next();
            int k=0;
            int l=0;
            for(int j=0;j<n;j++)
            {
                if(s.charAt(j)=='B'){
                    k=j;
                    break;
                }
            }
            for(int j=0;j<n;j++){
                 if(s.charAt(j)=='B')
                 {
                   l=j;
                 }
            }
            System.out.println(l-k+1);
        }
    }
}