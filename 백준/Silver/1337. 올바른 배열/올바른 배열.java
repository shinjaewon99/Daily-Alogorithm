import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 배열의 크기 입력
        int size = in.nextInt();

        List<Integer> store = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            store.add(in.nextInt());
        }

        Collections.sort(store);
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            // 1. 1 ~ 4 까지 더하면서 객체에 연속으로 저장되어있는지 탐색
            for (int j = 1; j < 5; j++) {
                // 2. 연속된 숫자가 없는경우 배열 값 증가
                if (!store.contains(store.get(i) + j)) {
                    result[i]++;
                }
            }
        }

        // 3. 추가해야될 원소의 최소를 구하기 위해 오름차순 정렬
        Arrays.sort(result);
        System.out.println(result[0]);
    }
}
