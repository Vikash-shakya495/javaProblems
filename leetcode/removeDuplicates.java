import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int[] newArr = removeDuplicates(arr);
        System.out.println(Arrays.toString(newArr));
    }
    public static int[] removeDuplicates(int[] arr){
        HashMap<Integer, Boolean > map = new HashMap<>();

        for( int num : arr){
            map.put(num,true);
        }

        ArrayList<Integer> uniqueValueIntegers = new ArrayList<>(map.keySet());
       
        int[] result = new int[uniqueValueIntegers.size()];
        for (int i = 0; i < uniqueValueIntegers.size(); i++) {
            result[i] = uniqueValueIntegers.get(i);
        }

        return result; 
    }
}