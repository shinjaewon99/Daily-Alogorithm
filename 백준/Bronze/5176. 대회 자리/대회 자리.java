import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt(); // 테스트의 갯수

        for(int i = 0; i < k; i++){
            int p = in.nextInt(); // 참가자의 수
            int m = in.nextInt(); // 자리의 수
            Set<Integer> store = new HashSet<>();
            for(int j = 0 ; j < p; j++){
                int num = in.nextInt();
                store.add(num);
            }

            System.out.println(p - store.size());
        }
    }
}