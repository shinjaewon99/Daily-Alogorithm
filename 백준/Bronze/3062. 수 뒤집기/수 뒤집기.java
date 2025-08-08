import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 케이스 개수
        in.nextLine();
        
        for (int i = 0; i < t; i++) {
            String number = in.nextLine();

            String reverseNum = new StringBuilder(number).reverse().toString();

            // 두 수의 합 구하기
            int sum = Integer.parseInt(number) + Integer.parseInt(reverseNum);

            // 합이 좌우 대칭인지 검사
            String result = String.valueOf(sum);
            boolean flag = true;
            for (int j = 0; j < result.length() / 2; j++) {
                if (result.charAt(j) != result.charAt(result.length() - 1 - j)) {
                    flag = false;
                    break;
                }
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
