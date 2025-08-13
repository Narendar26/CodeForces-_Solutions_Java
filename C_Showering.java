import java.util.*;
public class C_Showering{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int d=sc.nextInt();
            int sum=0;
            ArrayList<Integer>a1=new ArrayList<>();
            a1.add(0);
            int max=0;
            for(int j=0;j<n;j++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                max=Math.max(Math.abs(a1.get(j)-a),max);
                a1.add(b);

            }
            max=Math.max((m-a1.get(a1.size()-1)),max);
            if(max>=s){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
            
        }
    }
    
}