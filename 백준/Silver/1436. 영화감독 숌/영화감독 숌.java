import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        int result = 0;
        int count = 0;

        while(count != number) {
            result++;
            if(String.valueOf(result).contains("666")){
                count++;
            }
        }

        System.out.println(result);
    }
}
