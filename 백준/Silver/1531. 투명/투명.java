import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] graph = new int[101][101];

        for(int i = 0; i < n; i++){
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();

            // 해당 범위에 종이로 가린다.
            for(int j = x1; j <= x2; j++){
                for(int k = y1; k <= y2; k++){
                    graph[j][k]++;
                }
            }
        }

        int cnt = 0;
        for(int i = 1; i <= 100; i++){
            for(int j = 1; j <= 100; j++){
                if(graph[i][j] > m) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
