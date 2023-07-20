import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] numbers = in.next().split("-");
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            int temp = sum(numbers[i]);
            // 첫번째 숫자는 무조건 대입
            if (i == 0) {
                result += temp;
            } else {
                result -= temp;
            }
        }
        System.out.println(result);
    }

    // '+' 기준으로 파싱하여 sum 변수에 누적
    private static int sum(String number) {
        int sum = 0;
        String[] numbers = number.split("[+]");

        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);
        }
        return sum;
    }
}
