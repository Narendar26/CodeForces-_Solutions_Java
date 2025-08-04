import java.util.*;
public class B_Gifts_Fixing{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            long []arr1=new long[n];
            long []arr2=new long[n];
            for(int j=0;j<n;j++){
                arr1[j]=sc.nextLong();
            }
            for(int j=0;j<n;j++){
                arr2[j]=sc.nextLong();
            }
            long min1=Long.MAX_VALUE;
            long min2=Long.MAX_VALUE;
            for(int j=0;j<arr1.length;j++){
                if(min1>arr1[j]){
                   min1=arr1[j];
                }
                if(min2>arr2[j]){
                    min2=arr2[j];
                }
            }
            long oper=0;
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]==min1 || arr2[j]==min2){
                    continue;
                }
                else{
                   long min3=Math.min(Math.abs(arr1[j]-min1),Math.abs(arr2[j]-min2));
                   arr1[j]-=min3;
                   arr2[j]-=min3;
                   oper+=min3;
                }
            }
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]!=min1){
                    oper+=Math.abs(arr1[j]-min1);
                }
                if(arr2[j]!=min2){
                    oper+=Math.abs(arr2[j]-min2);
                }
            }
            System.out.println(oper);

        }

    }
}
