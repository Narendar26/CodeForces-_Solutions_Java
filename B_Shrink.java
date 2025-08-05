import java.util.*;
public class B_Shrink{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int max=a;
            int min=1;
            ArrayList<Integer>a1=new ArrayList<>();
            for(int j=1;j<=a;j++){
               if(j==min || j==max){
                continue;
                
               }
               else{
                a1.add(j);
               }
            }
            int b=a/2;
            a1.add(b,max);
            a1.add(min);
            for(int j=0;j<a1.size();j++){
                System.out.print(a1.get(j)+" ");
            }
            System.out.println();
            
        }
    }
}