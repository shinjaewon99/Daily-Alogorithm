import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        for (int i = 0; i < size; i++) {
            int number = in.nextInt();

            // 1. 항상 20명인 아이들 배열 크기 지정
            int[] arr = new int[20];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = in.nextInt();
            }

            // 2. check 메소드 호출하여 과정 진행
            int step = check(arr);

            System.out.println(number + " " + step);
        }
    }

    private static int check(int[] arr) {
        int count = 0;
        // 3. 자기 앞에 큰 학생이 있으면 count 누적
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    count++;
                }
            }
        }
        return count;
    }
}