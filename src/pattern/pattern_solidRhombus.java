package pattern;

import java.util.*;

public class pattern_solidRhombus {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
