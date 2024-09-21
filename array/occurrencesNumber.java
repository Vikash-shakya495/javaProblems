import java.util.Scanner;

public class occurrencesNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArr = arrayUtility.inputArray();
        System.out.println("Now enter the number you want to find : ");
        int num = input.nextInt();
        int occurrence = noOfOccurrences(numArr, num);
        System.out.println("The number " + num + " occurs " + occurrence + " times");
    }

    public static int noOfOccurrences(int[] numArr , int num){
        int occ = 0;
        int i = 0;
        while(i<numArr.length){
            if(numArr[i] == num ){
                occ++;
            }
            i++;
        }
        return occ;
    }
}

