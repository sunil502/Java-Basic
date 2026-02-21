
package functions;

import java.util.*;

public class func_circmOfcircle {
    public static float cirmOfCircle(int r){
        float circumference=(float)(2*3.14*r);
        return circumference;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        float circumference=cirmOfCircle(r);

        System.out.println(circumference);
    }
}
