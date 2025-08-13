import java.util.*;
public class A_Sakurako_s_Exam{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if((a==0 && b%2==0) || (a%2==0 && b==0)){
                System.out.println("YES");
            }
            else if((a==0 && b%2!=0) || (a%2!=0 && b==0) || (a>0 && b>0 && a%2!=0)){
                System.out.println("NO");
            }
            else if(a>0 && b>0 && a%2==0 && b%2==0){
                System.out.println("YES");
            }
            else if(a>0 && b>0 && a%2==0 && b%2!=0){
                System.out.println("YES");
            }
        

        }
    }
    
}