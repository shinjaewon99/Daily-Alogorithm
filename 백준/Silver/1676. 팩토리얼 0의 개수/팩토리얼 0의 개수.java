import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int result = 0;

        // 5! = 5 4 3 2 1
        // 10! = 10 9 8 .. 3 2 1
        while(number >= 5){
            result += number / 5;
            number /= 5;
        }

        System.out.println(result);
    }
}
