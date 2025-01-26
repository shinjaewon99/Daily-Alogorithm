import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int l =in.nextInt(); // 왼발
        int r = in.nextInt(); // 오른발
        int a = in.nextInt(); // 양발

        while (a > 0) {
            if (l < r) {
                l++; // 왼발잡이 추가
            } else {
                r++; // 오른발잡이 추가
            }
            a--; // 양발잡이 소모
        }

        int result = 2 * Math.min(l, r);

        System.out.println(result);
    }
}