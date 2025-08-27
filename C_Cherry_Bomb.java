import java.util.*;
public class C_Cherry_Bomb{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            boolean b=true;
            int []arr1=new int[n];
            int []arr2=new int[n];
            for(int j=0;j<arr1.length;j++){
                arr1[j]=sc.nextInt();
            }
            for(int j=0;j<arr2.length;j++){
                arr2[j]=sc.nextInt();
            }
            int sum=-1;
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int j=0;j<arr1.length;j++){
                int a=arr1[j];
                int c=arr2[j];
                min=Math.min(arr1[j],min);
                max=Math.max(arr1[j],max);
                if(a>=0 && c>=0){
                   sum=a+c;
                   b=false;
                   break;
                }

            }
            if(b){
                 System.out.println(Math.abs(k-(max-min))+1); 
            }
            else{
                boolean g=true;
                for(int j=0;j<arr1.length;j++){
                    int a=arr1[j];
                    int c=arr2[j];
                    if(a>=0 && c>=0){
                      if((a+c)!=sum){
                         g=false;
                         System.out.println(0);
                         break;
                      }
                    }
                    else if(a>=0 &&  c<0 ){
                         if((sum-a)>k || sum<a){
                            g=false;
                            System.out.println(0);
                            break;
                         }
                    }
                    
                }
                if(g){
                System.out.println(1);
                }
                
            }
        }
    }
}