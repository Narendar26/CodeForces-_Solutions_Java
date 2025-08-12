import java.util.*;
public class B_Team_Training{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int []arr=new int[n];
            for(int j=0;j<arr.length;j++){
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            int k=arr.length-1;
            int count=0;
            int count1=0;
            while(k>=0){
                if(arr[k]>=x){
                    count++;
                    k--;
                } 
                else{
                    count1++;
                    int min=arr[k];
                    if(min*count1>=x){
                        count++;
                        k--;
                        count1=0;
                    }
                    else{
                        k--;
                    }
                }
            }
            System.out.println(count);
        }
    }
    
}