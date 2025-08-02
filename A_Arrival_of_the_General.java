import java.util.*;
public class A_Arrival_of_the_General{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    int minIndex=0;
    int maxIndex=0;
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++)
    {
          if(min>arr[i])
          {
            min=arr[i];
          }
          if(max<arr[i])
          {
              max=arr[i];
          }
    }
    boolean b=true;
    for(int i=0;i<arr.length;i++)
    {
         if(min==arr[i])
         {
             minIndex=i;
         }
         if(max==arr[i])
         {
           if(b)
           {
              maxIndex=i;
              b=!b;
           }
         }
    }
    int q=arr.length-1;
     if(maxIndex<minIndex)
     {
        System.out.println(Math.abs(maxIndex-0)+Math.abs(minIndex-q));

     }
     else if(maxIndex>minIndex)
     {
      System.out.println((Math.abs(maxIndex-0)+Math.abs(minIndex-q))-1);
     }

}
}