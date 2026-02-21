import java.util.*;

public class stringConcat {
    public static void main(String args[]){
        //concat
        String firstName="Sunil";
        String lastName="Maurya";
        String fullName=firstName + "@" +lastName;
       // String fullName=firstName+lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());

        //charAt
        for (int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
