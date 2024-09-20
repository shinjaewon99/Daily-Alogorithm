import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int result = 0;

        // 반복문으로 거스름돈을 처리
        while (number >= 0) {
            if (number % 5 == 0) {
                result += number / 5;
                System.out.println(result);
                return;
            }
            number -= 2;
            result++;
        }

        System.out.println(-1);
    }
}
