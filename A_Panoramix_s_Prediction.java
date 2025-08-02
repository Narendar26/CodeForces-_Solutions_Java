import java.util.*;
public class A_Panoramix_s_Prediction{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int []arr={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};
    ArrayList<Integer>a1=new ArrayList<>();
    for(int i=0;i<arr.length;i++)
    {
            a1.add(arr[i]);
    }
    if(a>=47)
    {
        System.out.println("NO");
    }
    else {
          if(a1.get(a1.indexOf(a)+1)!=b)
          {
            System.out.println("NO");
          }
          else{
            System.out.println("YES");
          }
    }
    

}
}