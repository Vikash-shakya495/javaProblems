import java.util.Arrays;

class new1 {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        int[] arr2 = twoSum(arr ,target);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr={0,0};
        for(int i = 0; i < nums.length; i++){
            if(nums.length == 2){
                 arr[0] = i;
                    arr[1] = i+1;
                    break;
            }
            for(int j = i + 1; j < nums.length; j++){
                if((nums[i]+ nums[j] ) == target){
                     arr[0] =i;
                    arr[1] =j;
                }
            }
        } 
                    return arr;
    }
}