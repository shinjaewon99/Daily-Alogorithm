class Solution {
    private int answer = 0;
    private boolean[] visit;
    
    public int solution(int k, int[][] dungeons) {
        
        // 1. 던전의 갯수로 visit 논리배열 크기 설정
        int dungeonsLength = dungeons.length;
        visit = new boolean[dungeonsLength];
        
        dfs(0, k, dungeons);
        
        return answer;
    }
    
    private void dfs(int depth, int k, int[][] dungeons){
        
        for(int i = 0; i < dungeons.length; i++){
            if(!visit[i] && dungeons[i][0] <= k){
                visit[i] = true;
                
                // 2. 재귀함수를 통해 경우의수를 모두 탐색
                dfs(depth + 1, k - dungeons[i][1], dungeons);
                
                // 3. 방문 배열 논리값을 false로 초기화 해준다.
                // 이유 : 첫번재 -> 세번째 -> 두번째로 탐색할경우 두번째는 순서에 의해 
                // 이미 방문한걸로 되기 때문에 false로 해줘야된다.
                visit[i] = false;
            }
        }
        // 4. 순서의 최대값을 할당한다.
        answer = Math.max(depth, answer);
    }
}