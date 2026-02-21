package functions;

import java.util.*;

public class func_greater2Num {
    public static void greater2num(int a,int b){
        if(a>b)
            System.out.println("a is greater");
        else
            System.out.println("b is greater");
        return ;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        greater2num(a,b);
    }
}
