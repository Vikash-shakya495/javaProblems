public class sumAndAvg {
    public static void main(String[] args) {
        int[] numArray = sumAvgUtility.inputArray();
        long sum = sum(numArray);
        double avg = average(numArray);
        System.out.println("sum of the numbers " + sum);
        System.out.println("average of the numbers " + avg);
    }

    public static long sum(int[] numArray){
        long sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum += numArray[i];
            }
            return sum;
    }
    public static double average(int[] numArray) {
        double sum = sum(numArray);
        return sum/numArray.length;
    }
}
