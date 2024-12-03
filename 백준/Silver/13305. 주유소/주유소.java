import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt(); // 도시의 갯수

        long[] arr = new long[size - 1];
        long[] fill = new long[size];


        for (int i = 0; i < size - 1; i++) {
            arr[i] = in.nextLong();
        }

        for (int i = 0; i < size; i++) {
            fill[i] = in.nextLong();
        }

        long min = fill[0]; // 기름의 최소값
        long sum = 0; // 누적합
        // 10 4 4
        for (int i = 0; i < size - 1; i++) {

            if(fill[i] < min){
                min = fill[i];
            }

            sum += min * arr[i];
        }
        System.out.println(sum);
    }
}
