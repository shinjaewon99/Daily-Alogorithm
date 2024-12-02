import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();

        long[] store = new long[91];
        store[1] = 1;
        store[2] = 1;

        for(int i = 3; i <= test; i++){
            store[i] = store[i - 2] + store[i - 1];
        }

        System.out.println(store[test]);
    }
}
