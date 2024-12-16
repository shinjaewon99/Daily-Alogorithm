import java.util.*;

class Main {
    private static int[] store;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 나무의 수
        int m = in.nextInt(); // 집으로 가져갈 길이
        store = new int[n];

        int left = 0;
        int right = 0; 

        for (int i = 0; i < n; i++) {
            store[i] = in.nextInt();
            right = Math.max(store[i], right);
        }

        while (left <= right) {
            int mid = (left + right) / 2; // 중간값 계산 방식 변경

            long cut = getCut(mid); 

            if (cut >= m) { // 자른 나무의 길이가 목표치 이상이면
                left = mid + 1; // 더 높은 높이를 탐색
            } else {
                right = mid - 1; // 더 낮은 높이를 탐색
            }
        }

        System.out.println(right);
    }

    private static long getCut(final int h) {
        long result = 0;

        for (int tree : store) {
            if (tree > h) {
                result += tree - h;
            }
        }

        return result;
    }
}