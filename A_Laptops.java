import java.util.*;
public class A_Laptops{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer>h=new HashMap<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            h.put(a,b);

        }
        PriorityQueue<Map.Entry<Integer,Integer>>pq=new PriorityQueue<>((a,b)->a.getKey()-b.getKey());
         int []arr=new int[h.size()];
         int k=0;
         pq.addAll(h.entrySet());
        while(!pq.isEmpty()){
              Map.Entry<Integer,Integer>e=pq.poll();
             arr[k]=e.getValue();
             k++; 
             
        }
        for(int j=1;j<arr.length;j++){
            if(arr[j]<arr[j-1]){
                System.out.println("Happy Alex");
                return;
            }
        }
        System.out.println("Poor Alex");
    }
}