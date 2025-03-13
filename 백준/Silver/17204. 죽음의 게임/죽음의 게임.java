import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 게임 참가자 수
        int m = in.nextInt(); // 보성이의 번호

        int[] graph = new int[n];
        boolean[] visit = new boolean[n];
        
        for(int i = 0; i < n; i++){
            graph[i] = in.nextInt();
        }

        int start = 0; // 시작 학생 번호
        int count = 0;

        while(!visit[start]){
            // 보성이가 언급된 경우
            if(start == m){
                System.out.println(count);
                return;
            }
            visit[start] = true;
            start = graph[start];
            count++;
        }

        System.out.println("-1");
    }
}