import java.util.*;

class Main {
    private static int n; // 요리의 갯수
    private static int[][] graph;
    private static int result = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        graph = new int[n][2];

        for(int i = 0; i < n; i++){
            graph[i][0] = in.nextInt(); // 신맛
            graph[i][1] = in.nextInt(); // 쓴맛
        }

        findResult(0, 1, 0, false);

        System.out.println(result);
    }

    
    private static void findResult(int depth, int s, int b, boolean flag){
        if(depth == n){
            if(flag){
                result = Math.min(result, Math.abs(s - b));
            }

            return;
        }

        // 현재 재료를 선택하는 경우
        findResult(depth + 1, s * graph[depth][0], b + graph[depth][1], true);

        // 현재 재료를 선택하지 않는 경우
        findResult(depth + 1, s, b, flag);
    }
}