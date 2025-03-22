import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 메모장에 적힌 키워드 개수
        int m = in.nextInt(); // 블로그에 쓴 글의 개수
        in.nextLine(); 

        Set<String> store = new HashSet<>();

        for (int i = 0; i < n; i++) {
            store.add(in.nextLine());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String[] words = in.nextLine().split(",");
            for (String word : words) {
                store.remove(word); // 키워드 삭제
            }
            sb.append(store.size()).append("\n");
        }

        System.out.print(sb);
    }
}
