import java.util.*;

public class stringBufferNBuilder {
    public static void main(String[] args) {
        String s = "vikash" + "shakya";
        System.out.println(s); // vikashshakya

        String s1 = (new StringBuilder()).append("Java").append("Script").toString();
        System.out.println(s1); //JavaScript


        // Note : After a string literal, all the + will be treated as string concatenation operator.
        String s2 = 50+30+"Javascript"+19+95;
        System.out.println(s2); // 80Javascript1995


        // String s3 = "Vikash";
        // String s4 = "Shakya";
        // String s5 = s3.append(s4);
        
        // System.out.println(s5.toString());
        // in above example , here String cannot append we need StringBuffer or StringBuilder in order to modify the strings

        // let's see how can modify the string
        StringBuilder s6 = new StringBuilder("Java");
        StringBuilder s7 = new StringBuilder("Script");
        StringBuilder s8 = s6.append(s7);
        System.out.println(s8.toString()); // JavaScript
    }
}
