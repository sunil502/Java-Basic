package functions;

import java.util.*;

public class func_oddsum {
    public static int calculateSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0)
            sum=sum+i;
        }
        return sum;
    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=calculateSum(n);
        System.out.println(sum);
    }
}
