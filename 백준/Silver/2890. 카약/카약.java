import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();

        int[] stores = new int[10]; // 1~9팀의 오른쪽 끝 위치
        Arrays.fill(stores, -1);

        for (int i = 0; i < n; i++) {
            String word = in.nextLine();
            for (int j = 0; j < m; j++) {
                char ch = word.charAt(j);
                if (ch >= '1' && ch <= '9') {
                    int team = ch - '0';
                    stores[team] = Math.max(stores[team], j);
                }
            }
        }

        // 거리로 변환
        for (int i = 1; i <= 9; i++) {
            stores[i] = (m - 1) - stores[i];
        }

        int[] sorted = stores.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> resultMap = new HashMap<>();
        int find = 1;

        for (int index : sorted) {
            if (index != -1 && !resultMap.containsKey(index)) {
                resultMap.put(index, find);
                find++;
            }
        }

        for (int i = 1; i <= 9; i++) {
            System.out.println(resultMap.get(stores[i]));
        }
    }
}
