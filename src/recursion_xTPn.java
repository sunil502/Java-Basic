// stach height is n
import java.util.Scanner;

public class recursion_xTPn {
    public static int calPower(int x,int n){
        if(n==0){
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xPownm1=calPower(x,n-1);
        int xPown=x*xPownm1;
        return xPown;
    }

    public  static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n= sc.nextInt();
        int ans=calPower(x,n);
        System.out.println(ans);
    }
}
