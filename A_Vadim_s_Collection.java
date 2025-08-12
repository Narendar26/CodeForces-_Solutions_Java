import java.util.*;
public class A_Vadim_s_Collection{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String s=sc.next();
            ArrayList<Character>a=new ArrayList<>();
            for(int j=0;j<s.length();j++){
                a.add(s.charAt(j));

            }
            StringBuilder sb=new StringBuilder();
            for(int j=s.length()-1;j>=0;j--){
                if(a.contains((char)(j+'0'))){
                    sb.append(j);
                    a.remove(Character.valueOf((char)(j+'0')));
                    continue;
                }
                else{
                    int p=j+1;;
                    while(p>j){
                    
                        if(a.contains((char)(p+'0'))){
                          sb.append(p);
                          a.remove(Character.valueOf((char)(p+'0')));
                          break;

                        }
                        p++;

                        
                    }
                }

            }
            System.out.println(sb.toString());
        }
    }
    
}