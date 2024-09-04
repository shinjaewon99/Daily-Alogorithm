import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        in.nextLine();
        
        String word = in.nextLine();

        // 행의 갯수 
        int wordLength = word.length() / number;

        // 암호화된 암호를 저장할 배열
        char[][] store = new char[wordLength][number];


        boolean reverse = true;
        int index = 0;
        
        for(int i = 0; i < wordLength; i++){
            
            if(reverse) {
                
                // 왼쪽에서 오른쪽으로 담기
                for(int j = 0; j < number; j++){
                    store[i][j] = word.charAt(index++);
                }
            }else{
                
                // 오른쪽에서 왼쪽으로 담기
                for(int k = number - 1; k >= 0; k--){
                    store[i][k] = word.charAt(index++);
                }
            }
            // 방향 전환, true/false를 번갈아 가면서
            reverse = !reverse;
        }

        StringBuilder result = new StringBuilder();
        
        for(int i = 0 ; i < number; i++){
            for(int j = 0; j < wordLength; j++){
                result.append(store[j][i]);
            }
        }

        System.out.println(result.toString());
        
    }
}