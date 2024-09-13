public class bubbleSort {
    public static void main(String[] args) {

        // 6,1,9,14,18,11
        // 1,6,9,14,18,11
        // 1,6,9,14,11,18
        // 1,6,9,11,14,18


        int arr[] = {43,25,34,43,32,12,67,3,36,2};
        for(int j = arr.length-1; j >= 0; j--){

            for(int i = 0; i+1 <= j; i++){
    
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(" " + arr[i]);
        }
    }   
}
