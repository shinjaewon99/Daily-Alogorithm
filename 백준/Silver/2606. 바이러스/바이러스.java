import java.util.Scanner;

public class Main {
    private static int computer;
    private static int connect;
    private static boolean[] flag;
    private static int[][] computers;
    private static int count;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 컴퓨터의 수와 네트워크상 연결의수 입력
        computer = in.nextInt();
        connect = in.nextInt();


        // 2. 배열 크기 지정
        flag = new boolean[computer + 1];
        computers = new int[computer + 1][computer + 1];

        // 3. 배열 초기화
        for (int i = 1; i <= connect; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            
            computers[x][y] = computers[y][x] = 1; // 양방향 
        }


        // 4. 1번 컴퓨터 부터 시작
        dfs(1);
        System.out.println(count);
    }

    // 5. 네트워크상 연결되어있으면서 방문하지 않은지 검증
    private static void dfs(int number){
        flag[number] = true;

        for (int i = 1; i <= computer ; i++) {
            if(!flag[i] && (computers[number][i] == 1)){
                dfs(i);
                count++;
            }
        }
    }
}
