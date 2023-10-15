import java.util.Queue;
import java.util.LinkedList;

class Solution {
    // 1. 동,서 방향으로 이동하는 값
    private int[] dx = new int[]{0,1,0,-1};
    // 2. 남 북 방향으로 이동하는 값
    private int[] dy = new int[]{1,0,-1,0};
    private int[][] visit;
    private int answer = 0;
    public int solution(int[][] maps) {
        
        visit = new int[maps.length][maps[0].length];

        // 3. 초기 시작 위치 방문
        visit[0][0] = 1;
        
        
        dfs(visit, maps);
        
        // 9. 상대진영 위치
        answer = visit[maps.length - 1][maps[0].length - 1];
        
        // 10. 상대 팀 진영에 도달할 방법이 없는경우
        if(answer == 0){
            return -1;
        }
        return answer;
    }
    
    private void dfs(int[][] visit, int[][] maps){
        Queue<int[]> store = new LinkedList<>();
        
        // 4. 초기 Queue 객체 설정
        store.add(new int[]{0,0});
        
        while(!store.isEmpty()){
            int[] numbers = store.poll();
            // 5. x,y 좌표
            int x = numbers[0];
            int y = numbers[1];
            
            for(int i = 0; i < 4; i++){
                // 6. 상하좌우 이동 좌표
                int moveX = x + dx[i];
                int moveY = y + dy[i];
            
                // 7. 이동 좌표가 0이상 이며, 진영을 나가면 안되고, 
                // 방문하지 않았으며, 벽이 없는 자리 일경우
                if(moveX >= 0 && moveX < maps.length && moveY >= 0 
                   && moveY < maps[0].length && 
                   visit[moveX][moveY] == 0 && maps[moveX][moveY] == 1){
                    
                    // 8. 기존의 왔던길의 값 누적
                    visit[moveX][moveY] = visit[x][y] + 1;
                    store.add(new int[]{moveX, moveY});
                }
            }
            
        }
    }
}