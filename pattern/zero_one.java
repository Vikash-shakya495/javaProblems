public class zero_one {
    public static void main(String[] args){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                if((i%2==0 && j%2==1) || (i%2==1 && j%2==0)){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
