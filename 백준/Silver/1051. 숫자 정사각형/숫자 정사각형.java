import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); 
        int m = in.nextInt();
        in.nextLine();

        int[][] graph = new int[n][m];

        for (int i = 0; i < n; i++) {
            String inputLine = in.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = inputLine.charAt(j) - '0';
            }
        }

        int maxSquare = 1; // 최소 정사각형 크기는 1
        int maxLength = Math.min(n, m);

        for (int length = maxLength; length >= 1; length--) {
            for (int i = 0; i <= n - length; i++) {
                for (int j = 0; j <= m - length; j++) {
                    int compare = graph[i][j];
                    if (compare == graph[i][j + length - 1] && // 우측 상단
                        compare == graph[i + length - 1][j] && // 좌측 하단
                        compare == graph[i + length - 1][j + length - 1]) { // 우측 하단
                        System.out.println(length * length);
                        return;
                    }
                }
            }
        }

        // 정사각형 크기가 1인 경우
        System.out.println(maxSquare);
    }
}