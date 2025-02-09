import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 칸의 갯수

        if(n % 2 == 0){
            System.out.println("Duck");
        }else{
            System.out.println("Goose");
        }
       
    }
}