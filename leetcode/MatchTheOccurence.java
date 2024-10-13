public class MatchTheOccurence {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int result = matchStr(haystack, needle);
        System.out.println(result);  // Expected output: 0
    }

    public static int matchStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
