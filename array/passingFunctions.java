import java.util.Arrays;

public class passingFunctions {
    public static void main(String[] args) {
        int[] nums = {23,34,36,22};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
