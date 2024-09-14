import java.util.Scanner;

public class stringlength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int strLen = a.length() + b.length(); 
        int result = a.compareTo(b);
        System.out.println(strLen);
        if(result < 0){
        System.out.println("No");
        }
        else if(result > 0){
            System.out.println("is equal to");
        }
        else{
            System.out.println("yes");
        }
        System.out.println(capitalizeFirstLetter(a) + " " + capitalizeFirstLetter(b));
    }

    public static String capitalizeFirstLetter(String letter){
        return letter.substring(0,1).toUpperCase() + letter.substring(1).toLowerCase();
    }
}



