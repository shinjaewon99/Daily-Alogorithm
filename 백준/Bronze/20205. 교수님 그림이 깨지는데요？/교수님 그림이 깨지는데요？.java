import java.util.*;

class Main {
    private static int n;
    private static int k;

    private static int[][] graph;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        k = in.nextInt();

        graph = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                graph[i][j] = in.nextInt();
            }
        }

        // 업샘플링된 이미지 출력
        for (int i = 0; i < n; i++) {
            for (int ki = 0; ki < k; ki++) { // 세로로 k번 반복
                for (int j = 0; j < n; j++) {
                    for (int kj = 0; kj < k; kj++) { // 가로로 k번 반복
                        System.out.print(graph[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
        
    }
}