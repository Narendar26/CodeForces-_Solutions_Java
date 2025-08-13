import java.util.*;
public class A_Jzzhu_and_Children{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int []arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int count=0;
        int j=0;
        while(count<n){
            if(arr1[j]<=m && arr1[j]>0){
                count++;
                arr1[j]=(-count);
                j=(j+1)%n;
            }
            else if(arr1[j]>m ){
                arr1[j]-=m;
                j=(j+1)%n;
            }
            else{
                j=(j+1)%n;
            }
            
        }
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<arr1.length;i++){
           if(min>arr1[i]){
            min=arr1[i];
            index=i;
           }

        }
        System.out.println(index+1);
        
    }

}