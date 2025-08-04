import java.util.*;
public class A_Brain_s_Photos{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int col=sc.nextInt();
        String [][]mat=new String[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.next();
                
            }
        }
        

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                
                if(mat[i][j].matches("[CMY]")){
                    System.out.println("#Color");
                    return;
                }
                

                }
            }
            System.out.println("#Black&White");
        }
    }
    
