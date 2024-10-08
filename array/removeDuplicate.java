import java.util.ArrayList;
import java.util.HashMap;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 10, 20, 20, 10, 5, 10 };
        
        HashMap<Integer,Boolean> map = new HashMap<>();

        for(int num : arr){
            map.put(num,true);
        }

        ArrayList<Integer> uniqueValues = new ArrayList<>(map.keySet());

        System.out.println(uniqueValues.toString());

        /**
         * 
         * 
        1. HashMap<Integer, Boolean> map = new HashMap<>();
          
                HashMap<Integer, Boolean>: This declares a new HashMap named map that will store keys of type Integer and values of type Boolean.
                        Key: In this context, the Integer represents the values from the array, which we want to ensure are unique.
                        Value: The Boolean value (true) is not used for any specific purpose, but it allows us to use the HashMap to track the uniqueness of the keys.

        2. for (int num : array) { ... }
                for (int num : array): This is an enhanced for loop (also known as a "for-each" loop) that iterates through each element (num) in the array.
                        num: This variable represents the current element being processed from the array.
        
        3. map.put(num, true);
                map.put(num, true);: This line adds a new entry to the HashMap.
                        num: The current integer from the array is used as the key.
                        true: This value is stored but is not relevant to the task of removing duplicates; it's merely a placeholder indicating that the key exists in the map.
                        If num is already in the map, the put method will not add it again, ensuring that only unique keys are stored.

        4. ArrayList<Integer> uniqueValues = new ArrayList<>(map.keySet());
                ArrayList<Integer> uniqueValues: This declares a new ArrayList named uniqueValues that will hold Integer values (the unique elements).
                new ArrayList<>(map.keySet()): This creates a new ArrayList initialized with the keys from the map.
                        map.keySet(): This method returns a Set view of the keys contained in the HashMap. Since a Set does not allow duplicate values, it inherently contains only the unique elements from the original array.
        
           As a result, uniqueValues will contain all the unique integers from the original array.
         */
    }
}
