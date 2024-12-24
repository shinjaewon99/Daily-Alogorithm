import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();
        String result = getResult(word);

        System.out.println(result);
    }

    private static final String getResult(final String word) {
        int[] alpha = new int[26]; // 알파벳 저장 배열

        // 알파벳 빈도 저장
        for(char ch : word.toCharArray()){
            alpha[ch - 'A']++;
        }

        // 홀수 갯수 체크ㅊ
        int total = 0;
        char middle = 0; // 홀수 알파벳 저장

        for(int i = 0; i < 26; i++){
            if(alpha[i] % 2 != 0){
                total++;
                middle = (char)(i + 'A');
            }
        }
        
        StringBuilder firstOutput = new StringBuilder();

        for(int i = 0; i < 26; i++){
            for(int j = 0; j < alpha[i] / 2; j++){
                firstOutput.append((char)(i + 'A'));
            }
        }

        // 홀수의 갯수가 2개 이상이면 펠린드롬을 못만든다.
        if(total > 1){
            return "I'm Sorry Hansoo";
        }

        // 앞에 문자열 뒤집기
        StringBuilder secondOutput = new StringBuilder(firstOutput).reverse();

        
        // 홀수 알파벳이 있는경우 중앙에 추가
        if(total == 1){
            firstOutput.append(middle);
        }

        return firstOutput.toString() + secondOutput.toString();
    }
}