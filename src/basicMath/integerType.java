package basicMath;

import java.util.*;

public class integerType {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n > 0) {
            System.out.println("n is a positive number");
        } else if(n==0){
            System.out.println("n is a zero");
        }else{
            System.out.println("n is a negative number");
        }
    }

}
