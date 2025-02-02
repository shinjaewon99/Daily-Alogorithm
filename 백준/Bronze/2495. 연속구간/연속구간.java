import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            String word = in.nextLine();
            int count = 1;
            int resultCnt = 1;
            
            for(int j = 1; j < word.length(); j++){
                if(word.charAt(j) == word.charAt(j - 1)){
                    count++;
                    resultCnt = Math.max(resultCnt, count);
                }else{
                    count = 1; // 연속되지 않았다면 카운트 초기화
                }
            }

            System.out.println(resultCnt);
        }
    }
}