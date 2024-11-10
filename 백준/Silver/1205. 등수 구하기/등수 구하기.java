import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int newScore = in.nextInt();
        int p = in.nextInt();

        List<Integer> store = new ArrayList<>();

        for(int i = 0; i < n; i++){
            store.add(in.nextInt());
        }

        // 랭킹 리스트에 오를 수 없는 경우
        if(n == p && store.get(n - 1) >= newScore){
            System.out.println(-1);
            return;
        }

        // 새로운 점수를 추가후 등수 찾기
        store.add(newScore);
        Collections.sort(store, Collections.reverseOrder());

        for(int i = 0; i < store.size(); i++){
            if(store.get(i) == newScore){
                System.out.println(i + 1);
                return;
            }
        }
    }
}