import java.util.*;

public class StringObsession {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] substrings = sc.nextLine().split(" ");
        String mainString = sc.nextLine();
        int result = getMaxSubstringsRemoved(mainString, substrings);
        System.out.println(result);
    }

    public static int getMaxSubstringsRemoved(String mainString, String[] substrings) {
        int count = 0;
        List<String> substrList = Arrays.asList(substrings);
        boolean substringRemoved;
        do {
            substringRemoved = false;
            for (String sub : substrList) {
                if (mainString.contains(sub)) {
                    mainString = mainString.replaceFirst(sub, "");
                    count++;
                    substringRemoved = true;
                    break;
                }
            }
        } while (substringRemoved);

        return count;
    }
}
