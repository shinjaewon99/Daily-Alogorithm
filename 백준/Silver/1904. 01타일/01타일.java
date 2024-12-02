import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();

        long[] store = new long[1000001];
        store[1] = 1;
        store[2] = 2;
        store[3] = 3;

        for(int i = 4; i <= test; i++){
            store[i] = (store[i - 1] + store[i - 2]) % 15746;
        }

        System.out.println(store[test]);
    }
}
