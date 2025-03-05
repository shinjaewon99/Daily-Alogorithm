import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();

        if(n % 2 == 0){
            System.out.println("CY");
        }else{
            System.out.println("SK");
        }
    }
}
