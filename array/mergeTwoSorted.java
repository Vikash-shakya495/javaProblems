import java.util.Arrays;

public class mergeTwoSorted {
    public static void main(String[] args) {
        
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        int[] newArr = mergedFunc(arr1, arr2);
        System.out.println(Arrays.toString(newArr));
    }
    public static int[] mergedFunc(int[] arr1, int[] arr2){

        int[] mergedArr = new int[arr1.length + arr2.length];

        for(int i = 0; i < arr1.length; i++){
            mergedArr[i] = arr1[i];
        }
        for(int j = 0; j < arr2.length; j++){
            mergedArr[j + arr1.length] = arr2[j];
        }
        System.out.println(Arrays.toString(mergedArr));

        for(int i = 0; i < mergedArr.length -1; i++){
            for(int j = 0; j < mergedArr.length - 1; j++){
                if(mergedArr[j] > mergedArr[j + 1]){
                    int temp = mergedArr[j];
                    mergedArr[j] = mergedArr[j + 1];
                    mergedArr[j + 1] = temp;
                }
            }
        }
        return mergedArr;
    }
}
