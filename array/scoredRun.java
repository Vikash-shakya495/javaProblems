import java.util.Scanner;

public class scoredRun {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int score[] = {0,0,0,0,0,0};
        for(int i = 0; i < 6; i++){
            score[i] = sc.nextInt();
        }
        for(int j = 0; j < 6 ; j++){
            if(score[i]==0){
                count++;
            }
        }
    }
}
