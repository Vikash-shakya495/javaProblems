package leetcode;

public class isPalindrome {
    public static void main(String[] args) {
        int x = 1234321;
        int originalNumber = x;
        int reversedNumber = 0;
        Boolean isPalindrome = false;
        while( x != 0){
            int remainder = x%10;
            reversedNumber = reversedNumber * 10 + remainder;
            x = x/10;
        }
        if(originalNumber == reversedNumber){
            isPalindrome = true;
            System.out.println(isPalindrome);
            }
            else{
                System.out.println(isPalindrome);
            }

    }
}
