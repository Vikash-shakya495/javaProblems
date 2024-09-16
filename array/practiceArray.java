package array;

public class practiceArray {
    public static void main(String[] args){
        // int[] rollno1 = new int[5];
        
        // // or directly
        // int[] rollno2 = {23,4,53,65,55};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // ros is getting allocated in the heap. ros is pointing
        // to the first element of the array in the heap.
        for(int i = 0; i < ros.length; i++){
            ros[i] = i*2;
            System.out.println(ros[i]);
        }
        // System.out.println(ros);
    }
}
