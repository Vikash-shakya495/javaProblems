
public class MatchTheOccurence {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int result = matchStr(haystack, needle);
        System.out.println(result);
    }
    public static int matchStr(String hayStack, String needle){
        int currIndex = 0;
        String originalHaystack = hayStack;
        int needleLength = needle.length();
        for(int i = 0; i < hayStack.length(); i++){
            for(int j = 0; j < i; j++){
                if(originalHaystack.substring(j, i).equals(needle)){
                    return currIndex = i;
                    // return 0;
                }
                else{
                    originalHaystack[j] += hayStack[j];
                }
            }
        }
        return -1;
    } 
}
