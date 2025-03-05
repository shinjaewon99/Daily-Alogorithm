import java.util.*;

class Main {
    private static int n; // 문자의 갯수
    private static int[] values;
    private static Set<Integer> store = new HashSet<>();
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        values = new int[]{1, 5, 10, 50};

        backTrack(0, 0, 0);
        
        System.out.println(store.size());
    }

    private static void backTrack(int depth, int sum, int start){

        // 문자열 갯수와 동일할 경우
        if(depth == n){
            store.add(sum);
            return;
        }

        // 시작 인덱스 설정
        for(int i = start; i < 4; i++){
            backTrack(depth + 1, sum + values[i], i);
        }
    }
}
