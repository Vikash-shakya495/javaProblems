import java.util.*;

public class gradeSystem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        int subject1 = scanner.nextInt();
        int subject2 = scanner.nextInt();
        int subject3 = scanner.nextInt();
        int totalMarks = subject1 + subject2 + subject3;
        int grade = totalMarks / 3;
        if(grade >= 90){
            System.out.println("Grade: A");
        }
        else if((grade >= 85) &&( grade <=89)){
            System.out.println("Grade:  B");
        }
        else if((grade >= 80) && (grade <= 84)){
            System.out.println("Grade: C");
        }
        else if((grade >= 75) && (grade <= 79)){
            System.out.println("Grade: D");
        }
        else if((grade <= 74)){
            System.out.println("Grade: F");
        }
    }
}