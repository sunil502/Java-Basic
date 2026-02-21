import java.util.*;

public class stringBuilder {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("sunil");
        System.out.println(sb);
        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'p');
        System.out.println(sb);

        sb.insert(0,'p');
        System.out.println(sb);

        sb.insert(3,'i');
        System.out.println(sb);

        //delete
        sb.delete(3,4);
        System.out.println(sb);

        //append
        sb.append("l");//str=str+"l";
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
