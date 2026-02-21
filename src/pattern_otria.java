import java.util.*;

public class pattern_otria {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++){
            for (j=1;j<=n-i;j++){
                //inner loop ->space print
                System.out.print(" ");
            }
            //inner loop ->* print
            for (k=1;k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

