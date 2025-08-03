import java.util.*;
public class A_Short_Substrings{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
        String s=sc.next();
        StringBuilder sb=new StringBuilder();
        int j=0;
        while(j<s.length()){
            sb.append(s.charAt(j));
            j+=2;
        }
        sb.append(s.charAt(s.length()-1));
        System.out.println(sb.toString());
    }
}

}