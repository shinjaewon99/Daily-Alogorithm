class Solution {
  
    public int solution(int[][] board) {
        int answer = 0;
        int length = board.length;
        
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                
                // 지뢰를 발견한 경우
                if (board[i][j] == 1) continue;
                
                boolean bomb = true;
                
                // 총 8개의 타일을 비교, 상하좌우대각선
                for(int dx = -1; dx < 2; dx++){
                    for(int dy = -1; dy < 2; dy++){
                        
                        int moveDx = i + dx;
                        int moveDy = j + dy;
                        
                        // 타일을 벗어나는 경우
                        if(moveDx < 0 || moveDx >= length || moveDy < 0 || moveDy >= length){
                            continue;
                        }
                        
                        // 인접한 타일이 지뢰인경우
                        if(board[moveDx][moveDy] == 1){
                            bomb = false;
                            break;
                        }
                    }
                }
                if(bomb) answer++;
            }
        }
        
        
        return answer;
    }
}