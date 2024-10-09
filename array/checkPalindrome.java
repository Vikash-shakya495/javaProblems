public class checkPalindrome {
    public static void main(String[] args) {
        int[] numArr = arrayUtility.inputArray();
        boolean isPalin = isPalindrome(numArr);
        String result = (isPalin) ? "Palindome"  : "Not palindrome" ;
        System.out.println(result);
    }
    public static boolean isPalindrome(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            if(arr[i] == arr[arr.length - 1 - i]){
                return true;
            }
        }
        return false;
    }
}
