import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 치킨집의 개수
        int[] store = new int[n];

        for (int i = 0; i < n; i++) {
            store[i] = in.nextInt();
        }

        int k = in.nextInt(); // 현재 정렬 중인 회원의 수
        int groupSize = n / k; 

        // 각 그룹을 정렬
        // Arrays.sort(배열, 시작 인덱스, 끝 인덱스) 해당 인덱스 만큼만 정렬
        for (int i = 0; i < n; i += groupSize) {
            Arrays.sort(store, i, i + groupSize);
        }

        for (int num : store) {
            System.out.print(num + " ");
        }
    }
}
