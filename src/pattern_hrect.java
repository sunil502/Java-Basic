import java.util.*;

public class pattern_hrect {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for (j=1;j<=m;j++){
                if(i==1 || j==1 || j==m || i==n) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
               }
            System.out.println(" ");
            }
        }
    }

