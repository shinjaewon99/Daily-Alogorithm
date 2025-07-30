import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println((long)n * n);

        // O(n^2) 이므로 차수가 2
        System.out.println(2);
        
    }
}