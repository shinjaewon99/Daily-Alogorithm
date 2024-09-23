import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int stone = in.nextInt();


        if(stone % 2 == 0){
            System.out.println("SK");
        }else{
            System.out.println("CY");
        }
    }
}
