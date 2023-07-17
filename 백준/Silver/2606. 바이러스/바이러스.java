import java.util.Scanner;

public class Main {


    static int n;
    static int m;
    static boolean [][] arr;
    static boolean [] visit;
    static int x;
    static int y;
    static int result;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        // 배열 초기화 (n까지 인덱스)
        arr = new boolean[n+1][n+1];
        visit = new boolean[n+1];

        for(int i = 0; i < m; i++){
            x = in.nextInt();
            y = in.nextInt();
            // 네트워크상 연결되어있다.
            arr[x][y] = arr[y][x] = true;
        }

        // 1번 노드부터 시작함
        DFS(1);
        System.out.print(result - 1);


    }

    private static void DFS(int a){
        result++;
        visit[a] = true;
        for(int i = 1; i <= n; i++) {
            // 방문 하지 않았고, arr 배열의 값이 있을경우
            if (!visit[i] && arr[a][i]){
                DFS(i);
            }
        }
    }


}