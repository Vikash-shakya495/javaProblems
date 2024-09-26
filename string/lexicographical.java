import java.util.Scanner;

public class lexicographical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = sc.nextLine();
        int k = sc.nextInt();

        String result = getGreatestAndSmallest(s, k);
        System.out.println(result);
        sc.close();


    }
    public static String getGreatestAndSmallest(String s , int k){
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for(int i = 1; i <= s.length() - k; i++){
            String substring = s.substring(i, i + k);
            if(substring.compareTo(smallest) < 0){
                smallest = substring;
            }
            if(substring.compareTo(largest) > 0){
                largest = substring;
            }
        }
        return smallest + "\n" + largest;
    }  
}