import java.util.*;

class Main {
    private static int n, m;
    private static char[][] graph;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();
        graph = new char[n][m];
        in.nextLine();
        
        for(int i = 0; i < n; i++){
            String line = in.nextLine();
            for(int j = 0; j < m; j++){
                graph[i][j] = line.charAt(j);
            }
        }

        int max = Integer.MAX_VALUE;

        // 모든 8x8 시작점 탐색
        for(int i = 0; i <= n - 8; i++){
            for(int j = 0; j <= m - 8; j++){
                max = Math.min(max, check(i, j));
            }
        }

        System.out.println(max);
    }

    private static int check(int x, int y){
        int cnt1 = 0; // 시작이 'W'일 때
        int cnt2 = 0; // 시작이 'B'일 때

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char current = graph[x + i][y + j];

                // (i + j) 짝수, 시작 색과 같아야 함
                if ((i + j) % 2 == 0) {
                    if (current != 'W') cnt1++;
                    if (current != 'B') cnt2++;
                } else { // (i + j) 홀수, 시작 색과 달라야 함
                    if (current != 'B') cnt1++;
                    if (current != 'W') cnt2++;
                }
            }
        }

        return Math.min(cnt1, cnt2);
    }
}