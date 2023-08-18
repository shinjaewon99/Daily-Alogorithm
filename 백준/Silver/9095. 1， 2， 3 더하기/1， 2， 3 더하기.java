import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        int [] arr = new int [11];
        // 초기값
        // 1, 2, 3으로 값을 만드는 것임으로
        arr[1] = 1; // 1
        arr[2] = 2; // 1+1 , 2
        arr[3] = 4; // 1+1+1, 1+2, 2+1

        for(int i = 0; i < size; i++) {
            int temp = in.nextInt();

            for (int j = 4; j <= temp; j++) {
                arr[j] = arr[j - 3] + arr[j - 2] + arr[j - 1];
            }
            System.out.println(arr[temp]);

        }
    }
}

