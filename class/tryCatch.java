public class tryCatch {
    public static void main(String[] args){
        int arr[] = new int[10];
        try{
            int c =2/0;
            System.out.println(arr[10]);
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
        catch(ArrayIndexOutOfBoundsException aibe){
            System.out.println(aibe);
        }finally{
            System.out.println("This block will be executed always..");
        }
    }
}