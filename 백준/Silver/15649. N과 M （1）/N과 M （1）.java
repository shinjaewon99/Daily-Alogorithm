import java.util.*;

public class Main {
    private static int[] store;
    private static boolean[] visit;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int length = in.nextInt();

        store = new int[length];
        visit = new boolean[number];

        dfs(number, length, 0);
        
    }

    private static void dfs(int number, int length, int depth) {

        if(length == depth) {
            for(int result : store){
                System.out.print(result + " ");
            }
            System.out.println();
            return; // 백트레킹
        }

        for(int i = 0; i < number; i++){

            // 해당 노드를 방문 하지 않았을 경우
            if(!visit[i]){
                store[depth] = i + 1;
                visit[i] = true;
                dfs(number, length, depth + 1);
                visit[i] = false; // 다른 경로 탐색
            }
        }
        
    }
}