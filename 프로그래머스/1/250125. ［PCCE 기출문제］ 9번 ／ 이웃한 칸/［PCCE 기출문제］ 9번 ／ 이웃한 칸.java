class Solution {
    
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};
    
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int length = board.length;
        
        
        for(int i = 0; i < 4; i++){
            int xCheck = h + dx[i];
            int yCheck = w + dy[i];
            
            // 범위 체크
            if((0 <= xCheck && xCheck < length) && 0 <= yCheck && yCheck < length){
                // 주어진 보드의 색깔은고정
                if(board[h][w].equals(board[xCheck][yCheck])){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}