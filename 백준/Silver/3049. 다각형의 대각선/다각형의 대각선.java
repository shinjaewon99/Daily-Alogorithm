import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        // nC4
        int result = n * (n - 1) * (n - 2) * (n - 3) / 24;
        System.out.println(result);
        
    }
}
