package functions;

import java.util.*;

public class func_vote {
    public static void elibleToVote(int age){
        if(age>18)
            System.out.println("eligible to vote");
        else
            System.out.println("not eligible to vote");
        return;
    }
    public static void main(String  args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        elibleToVote(age);
    }
}
