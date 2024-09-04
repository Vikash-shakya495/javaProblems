public class array {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int[] input;
        // input = new int[5];
        // input[0] =10;
        // input[1] =20;
        // input[2] =30;
        // input[3] =40;
        // for(int k = 0; k <= input.length; k++){
        //     System.out.print("\n "+ input[k]);
        // }
        int[] input = {10,20,30,40,50};

        int min = input[0];
        int max = input[0];
        for(int k = 0; k < input.length; k++){
            if(min > input[k]){
                min = input[k];
            }
            if(max < input[k]){
                max = input[k];
            }
            // System.out.prinln("\n "+ input[k]);
        }
        System.out.print("\n the min : " + min + " and max : " + max);
    }
}
