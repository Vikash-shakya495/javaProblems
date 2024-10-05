import java.util.Arrays;
import java.util.Scanner;

public class electronicShop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] items = new int[5];
        int sum = 0;
        for(int i = 0 ; i < items.length; i++){
            items[i] = scanner.nextInt();
            sum += items[i];
        }
        System.out.println(Arrays.toString(items));
        System.out.println(sum);
        double average = (double) sum/items.length;
        System.out.println(average);

        int expensive = items[0];
        int cheapest = items[0];
        for(int i = 1 ; i < items.length ; i++){
            if(expensive < items[i]){
                expensive = items[i];
            }
            if(cheapest > items[i]){
                cheapest = items[i];
            }
        }
        System.out.println("The most expensive amount of items is : " + expensive);
        System.out.println("The most cheapest amount of the item is : " + cheapest);
    }
}
