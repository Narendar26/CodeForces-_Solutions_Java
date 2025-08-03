import java.util.*;
public class A_Fair_Playoff{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
        int []arr=new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int []arr1=new int[4];
        for(int i=0;i<arr.length;i++){
          arr1[i]=arr[i];
        } 
        Arrays.sort(arr1);
          if(arr1[arr1.length-2]> Math.min(Math.max(arr[0],arr[1]),Math.max(arr[2],arr[3]))){
            System.out.println("NO");
          }
          else{
            System.out.println("YES");
          }
        
    }
}
    
}