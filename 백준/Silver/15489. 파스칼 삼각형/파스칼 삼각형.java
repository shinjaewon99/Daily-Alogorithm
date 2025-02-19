import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
        int c = in.nextInt();
        int w = in.nextInt();

        int[][] graph = new int[30][30];

        for(int i = 0; i < 30; i++){
            // 초기 값 생성
            graph[i][0] = 1;

            for(int j = 1; j <= i; j++){
                graph[i][j] = graph[i - 1][j - 1] + graph[i - 1][j];
            }
        }

        int sum = 0;
        for(int i = 0; i < w; i++){
            for(int j = 0; j <= i; j++){
                sum += graph[r + i - 1][c + j - 1];
            }
        }

        System.out.println(sum);
    }
}
