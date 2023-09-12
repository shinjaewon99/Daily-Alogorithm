class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int plus = 0;
        
        // 1. photo 2차원 배열의 길이 만큼 탐색
        for(int i = 0; i < photo.length; i++){
            // 2. photo 2차원 배열의 i번 인덱스 만큼 탐색
            for(int j = 0; j < photo[i].length; j++){
                for(int k = 0; k < name.length; k++){
                    if(name[k].equals(photo[i][j])){
                        plus += yearning[k];
                        answer[i] = plus;
                    }
                }
            }
            
            // 3. answer 배열의 한개의 인덱스를 채웠으면 plus 변수 초기화
            plus = 0;
        }
        
        return answer;
    }
}