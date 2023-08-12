import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        long[] arr = new long[91];

        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= size; i++) {
            arr[i] += arr[i - 2] + arr[i - 1];

        }
        System.out.print(arr[size]);

    }
}


