import java.util.*;

public class bits_get {
    public static void  main(String args[]){
        int n=5;
        int pos=3;
        int bitMask=1<<pos;
        if((bitMask & n)==0){
    System.out.println("bit was zero");
        }else{
    System.out.println("bit was one");
        }
    }
}
