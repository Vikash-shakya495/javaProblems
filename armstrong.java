public class armstrong {
    public static void main(String[] args){
        int n = 370;
        int temp = n;
        int t=0;
        int r;
        while(temp>0){
            r=temp%10;
            t=t+(r*r*r);
            temp=temp/10;
        }
        if(t==n){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armastrong Number");
        }

    }
}
