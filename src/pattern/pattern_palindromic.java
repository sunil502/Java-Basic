package pattern;

import java.util.*;

public class pattern_palindromic {
    public  static void  main( String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out .print(" ");
            }
            for(k=i;k>=1;k--){
                System.out.print(k);
            }
            for(k=2;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
