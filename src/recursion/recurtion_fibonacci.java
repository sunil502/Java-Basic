package recursion;

import java.util.*;

public class recurtion_fibonacci {
    public static void printFibo(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+ " ");
        printFibo(b,c,n-1);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print(a+ " ");
        System.out.print(b+ " ");
        printFibo(a,b,n-2);
    }

}
