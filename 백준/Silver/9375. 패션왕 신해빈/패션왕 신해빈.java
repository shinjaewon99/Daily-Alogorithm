import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 케이스 갯수

        for(int i = 0; i < t; i++){
            int n = in.nextInt();

            Map<String, Integer> store = new HashMap<>();
            for(int j = 0; j < n; j++){
                String value = in.next();
                String key = in.next();

                store.put(key, store.getOrDefault(key, 1) + 1);
            }

            int total = 1;

            // 모든 경우의 수를 다구함
            for(String find : store.keySet()){
                int findValue = store.get(find);
                total *= findValue;
            }

            // 알몸인 경우를 빼준다.
            System.out.println(total - 1);
        }
    }
}