import java.util.*;
public class A_New_Year_Transportation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int []arr=new int[n];
        for(int i=1;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
    
        int j=1;
        boolean b=true;
          while(j<arr.length){
            if(j==t){
                System.out.println("YES");
                  return;
            }
            else if(j>t)
            {
                System.out.println("NO");
                 return;
            }
            else{
                j+=(arr[j]);
            }
            
        }
        if(j==t)
           System.out.println("YES");
        else{
            System.out.println("NO");
        }   
    }

}
