import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int number = in.nextInt();
        System.out.println(fibo(number));
    }

    private static long fibo(final int number) {
        if (number <= 3) {
            return 1;
        }

        long[] store = new long[number + 1];
        store[1] = 1; 
        store[2] = 1;
        store[3] = 1;

        for (int i = 4; i <= number; i++) {
            store[i] = store[i - 1] + store[i - 3];
        }

        return store[number];
    }
}
