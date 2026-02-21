import java.util.*;

public class pattern_floyds_tria{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,number=1;
        for(i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            j++;
            System.out.println();
        }
    }
}

