import  java.util.*;

public class fibonacci {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a=-1;
        int b=1;
        int fibo;
        for (int i=0;i<n;i++){
            fibo=a+b;
            a=b;
            b=fibo;
            System.out.print(fibo+" ");
        }

    }
}
