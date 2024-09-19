import java.util.*;

public class introToArray {
    public static void main(String[] args) {

        // array of primitive
        int[] marks = new int[3];
        int marksArray[] = {45,98,88};
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // do this marks iteration by loop

        for(int i = 0; i < 3; i++){
            System.out.println(marks[i]);
            System.out.println("this is marks: " + marksArray[i]);
        }


        
        int[] arr = {23,342,324,23,4,32,34};

        // enhanced for loop
        for(int num : arr ){
            System.out.print(num + " " );
        }


        // array of objects
System.out.println("array of objects");
        Scanner sc = new Scanner(System.in);
        String[] str = new String[4];
        for(int i = 0; i < str.length; i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

        str[1] = "Vikash";

        System.out.println(Arrays.toString(str));


        sc.close();
    }
}
