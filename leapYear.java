public class leapYear {
    public static void main(String[] args) {
        int year = 2000;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0 ){

                    System.out.println(" year is leap year");
                }
        }
    }
    else{
        System.out.println("this is not leap year");
    }
}
}
