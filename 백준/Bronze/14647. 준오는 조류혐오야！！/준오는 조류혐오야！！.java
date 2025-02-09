import java.util.*;

class Main {
    private static int x;
    private static int y;
    private static int[][] graph;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        graph = new int[x][y];

        int total = 0;
        int[] rowcnt = new int[x];
        int[] colcnt = new int[y];

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                graph[i][j] = in.nextInt();

                // 9를 포함하는지 확인
                int count = check(graph[i][j]);
                rowcnt[i] += count;
                colcnt[j] += count;
                total += count;
            }
        }

        int maxCnt = 0;

        for (int i = 0; i < x; i++) {
            maxCnt = Math.max(maxCnt, rowcnt[i]);
        }
        for (int j = 0; j < y; j++) {
            maxCnt = Math.max(maxCnt, colcnt[j]);
        }

        System.out.println(total - maxCnt);
    }

    private static int check(int num){
        int count = 0;
        while(num > 0){
            if(num % 10 == 9) count++;
            num/=10;
        }
        return count;
    }
}