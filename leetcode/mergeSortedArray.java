package leetcode;

import java.util.Arrays;

public class mergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        int[] newArr = merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(newArr));
    }

    public void merge(int[] nums1, int m , int[] nums2, int n){
        int[] mergeArr = new int[m+n];

        for(int i = 0 ; i < nums1.length; i++){
            newArr[i] = nums[i];
        }
        for(int j = 0; j < nums2.length; j++){
            newArr[m+j] = nums2[j];
        }

        for(int i = 0; i < mergeArr.length; i++){
            for(int j = 0; j < mergeArr.length; j++){
                if(mergeArr[i] > mergeArr[j]){
                    int temp = mergeArr[i];
                    mergeArr[i] = mergeArr[j];
                    mergeArr[j] = temp;
                    }
            }
        }
        return mergeArr;
    }
}
