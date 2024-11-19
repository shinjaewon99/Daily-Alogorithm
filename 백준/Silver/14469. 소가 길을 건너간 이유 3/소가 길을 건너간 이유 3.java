import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        int[][] store = new int[t][2];
        int endTimer = 0;

        for(int i = 0; i < t; i++){
            store[i][0] = in.nextInt();
            store[i][1] = in.nextInt();
        }

        // 2차원 배열 정렬
        Arrays.sort(store, (o1, o2) -> o1[0] - o2[0]);


        for(int i = 0; i < t; i++){
            // 소가 도착한 시간이 이전의 소가 검문을 끝내는 시간보다 큰경우
            if(endTimer < store[i][0]){
                // 끝나는 시간 갱신
                endTimer = store[i][0] + store[i][1];
            }else{
                // endTimer을 끝까지 기다린 다음에 검문을 실시
                endTimer += store[i][1];
            }
        }

        System.out.println(endTimer);
    }
}
