import java.util.*;

public class arraylistString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Graphes");
        System.out.println("Original list: " + list);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements you want to add");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            System.out.println("Enter element " + (i));
            String ele = sc.nextLine();
            list.add(ele);
        }
        System.out.println("Updated list: " + list);
        String remove = sc.nextLine();
        list.removeIf(item -> item.equals(remove));
        System.out.println(list);
        sc.close();
    }
}
