import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 10, 20, 20, 10, 5, 10 };
        
        HashMap<Integer,Boolean> map = new HashMap<>();

        for(int num : arr){
            map.put(num,true);
        }

        ArrayList<Integer> uniqueValues = new ArrayList<>(map.keySet());
        System.out.println(uniqueValues.toString());
    }
}
