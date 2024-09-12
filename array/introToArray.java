public class introToArray {
    public static void main(String[] args) {
        int[] marks = new int[3];
        int marksArray[] = {45,98,88};
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // do this marks iteration by loop

        for(int i = 0; i < 3; i++){
            System.out.println(marks[i]);
            System.out.println("this is marks: " + marksArray[i]);
        }
    }
}
