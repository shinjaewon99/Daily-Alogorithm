import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        // 현재 승률
        long percent = (long) y * 100 / x; 
        int left = 0; 
        int right = 1_000_000_000; // 이분 탐색 범위
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            long newZ = (long) (y + mid) * 100 / (x + mid);

            if (newZ > percent) {
                result = mid; // 승률이 증가하는 최소 판 수 갱신
                right = mid - 1; // 더 적은 판으로 가능한지 확인
            } else {
                left = mid + 1; // 더 많은 판이 필요한 경우
            }
        }

        System.out.println(result);
    }
}
