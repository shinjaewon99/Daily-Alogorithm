class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];
            int maxCount = 0;
            int minCount = 0;

            // 1. lottos 배열 탐색후 최대로 맞을수 있는 번호 갯수 계산
            for (int lotto : lottos) {
                for (int win_num : win_nums) {
                    if (lotto == win_num) maxCount++;

                }

                if (lotto == 0) maxCount++;
            }

            // 2. lottos 배열 탐색후 최소로 맞을수 있는 번호 계산
            for (int lotto : lottos) {
                for (int win_num : win_nums) {
                    if (lotto == win_num) minCount++;

                }
            }

            // 3. 최대 번호 갯수에 따른 등수 할당
            switch (maxCount) {
                case 6:
                    answer[0] = 1;
                    break;
                case 5:
                    answer[0] = 2;
                    break;
                case 4:
                    answer[0] = 3;
                    break;
                case 3:
                    answer[0] = 4;
                    break;
                case 2:
                    answer[0] = 5;
                    break;
                case 1:
                case 0:
                    answer[0] = 6;
                    break;
                default:
                    break;
            }
            
            // 3. 최소 번호 갯수에 따른 등수 할당
            switch (minCount) {
                case 6:
                    answer[1] = 1;
                    break;
                case 5:
                    answer[1] = 2;
                    break;
                case 4:
                    answer[1] = 3;
                    break;
                case 3:
                    answer[1] = 4;
                    break;
                case 2:
                    answer[1] = 5;
                    break;
                case 1:
                case 0:
                    answer[1] = 6;
                    break;
                default:
                    break;
            }

            return answer;
        }
    }