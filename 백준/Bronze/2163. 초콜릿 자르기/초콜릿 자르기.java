import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int result = n - 1 + n * (m - 1);
        System.out.println(result);
        
    }
}
