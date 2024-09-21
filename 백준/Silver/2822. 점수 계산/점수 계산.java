import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         // 문제 번호와 점수를 저장할 리스트 객체
        List<int[]> store = new ArrayList<>();

        for(int i = 1; i <= 8; i++){
            store.add(new int[]{i, in.nextInt()});
        }

        Collections.sort(store, (a, b) -> b[1] - a[1]);

        int total = 0;
        List<Integer> keyStore = new ArrayList<>();

        // 저장한 리스트 객체에서 총 합과 인덱스 순서 저장
        for(int i = 0; i < 5; i++){
            total += store.get(i)[1];
            keyStore.add(store.get(i)[0]);
        }

        Collections.sort(keyStore);

        System.out.println(total);

        for(int key : keyStore){
            System.out.print(key + " ");
        }
    }
}
