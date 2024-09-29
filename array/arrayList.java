import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        System.out.println(cars);

        // insert element at the specific index in the arrayList
        cars.add(1, "Honda");
        System.out.println(cars);

        // access the element from the arraylist
        String get = cars.get(3);
        System.out.println(get);

        // modify the element in the array
        cars.set(2, "Lamborghini"); // change the element at the index = 2
        System.out.println(cars);

        // remove the element from array
        cars.remove(4); // it will remove Toyota
        System.out.println(cars);

        // how many element present in the array
        int ele = cars.size();
        System.out.println(ele);

        // iterating and printing the values of arrayList
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // ArrayList with the for-each loop
        System.out.println("ArrayList with the for-each loop");
        for (String car : cars) {
            System.out.println(car);
        }

        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(30);
        nums.add(20);
        nums.add(60);
        nums.add(50);
        nums.add(40);
        System.out.println("Unsorted array");
        System.out.println(nums);

        Collections.sort(nums);
        System.out.println("Sorted Array");
        System.out.println(nums);

    }
}