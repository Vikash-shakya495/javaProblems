public class GFG {
    public static void main(String[] args) {
        if(args.length>0){
            System.out.println("The Commandline arguments are: ");
            int count=1;
            for(String val : args){
                System.out.println(count+". "+val);
                ++count;
            }
        }
        else{
            System.out.println("No commandline arguments passed");
        }
    }
}
