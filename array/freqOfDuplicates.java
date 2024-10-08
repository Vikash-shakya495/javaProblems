import java.util.HashMap;

public class freqOfDuplicates{
    public static void main(String[] args) {
        int[] array = {10,20,20,10,10,20,5,20};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for(int num : array){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequencies of Duplicates in array : ");
        for(int key : frequencyMap.keySet()){
            if(frequencyMap.get(key) > 1){
                System.out.println("Number : " + key + " Frequency : " + frequencyMap.get(key));
            }
        }

        /**
         * 
         * 
        Explanation:
    
            for (int num : array):

                This is a for-each loop. It iterates through each element (num) in the array.
                Each time the loop runs, the variable num holds the current element from the array.
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1):

                frequencyMap.put(num, ...):
                    This puts the element num into the HashMap (frequencyMap).
                    The num is the key, and the value associated with this key is the frequency (the count of how many times num has appeared).
            
            frequencyMap.getOrDefault(num, 0):
                This checks if num is already in the HashMap.
                If num exists in the HashMap, getOrDefault returns its current frequency.
                If num does not exist, getOrDefault returns the default value, which is 0.
           
            + 1:
                After getOrDefault fetches the current count of num (or 0 if it's the first time num is encountered), this adds 1 to the count.
                This effectively increments the count for that particular num.
         


            for (int key : frequencyMap.keySet()):

                    frequencyMap.keySet() returns a set of all the keys in the HashMap. These keys are the unique elements from the array.
                    The loop iterates through each key (which is an integer representing a value from the original array).
                    key refers to each unique element of the array that was added to the HashMap.
            
            if (frequencyMap.get(key) > 1):

                frequencyMap.get(key) returns the frequency (count) associated with the key (num).
                > 1 checks if the frequency of this element is greater than 1, indicating that the element is a duplicate (it appeared more than once in the array).
                If the condition is true, the element is printed as a duplicate.

            System.out.println(key + " appears " + frequencyMap.get(key) + " times.");:

                This prints the element (key) and its frequency (frequencyMap.get(key)).
                For example, if key is 2 and frequencyMap.get(2) is 3, it will print: 2 appears 3 times.
                */
    }
}