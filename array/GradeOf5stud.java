import java.util.Arrays;
import java.util.Scanner;

public class GradeOf5stud {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many students : ");
        int noOfStud = sc.nextInt();
        System.out.print("Enter how many subjects : ");
        int noOfsub = sc.nextInt();
        int[][] marks = new int[noOfStud][noOfsub];
        for(int row = 0;row < noOfStud; row++){
            System.out.println("next students marks , rollno " + (row + 1));
            for(int col = 0; col < noOfStud; col++){
                marks[row][col] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(marks));

    }
}
