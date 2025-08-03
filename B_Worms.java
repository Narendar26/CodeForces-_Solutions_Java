import java.util.*;
public class B_Worms{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=sc.nextInt();
        int []arr1=new int[l];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        int []pref=new int[n];
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            pref[i]=sum;
        }
        for(int i=0;i<arr1.length;i++){
            int r=Index(arr1[i],pref);
            System.out.println(r+1);
        }
    }
    private static int Index(int k,int []pref){
        int low=0;
        int high=pref.length-1;
        while(low<high){
             int mid=(low+high)/2;
             if(pref[mid]==k)
                return mid;
             else if(pref[mid]>k){
                high=mid;
             }    
             else{
                low=mid+1;
             }
        }
        return low;

    }

}