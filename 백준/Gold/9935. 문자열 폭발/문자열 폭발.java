import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        StringBuilder output = new StringBuilder();
        Stack<Character> store = new Stack<>();
        
        String word = in.nextLine();
        String boom = in.nextLine();

        int wordLen = word.length();
        int boomLen = boom.length();

        for(int i = 0; i < wordLen; i++){
            int count = 0;

            // 한 글자씩 담는다.
            store.push(word.charAt(i));

            // 크기가 폭탄 길이와 크거나 같으면 탐색 시작
            if(store.size() >= boomLen){
                for(int j = 0; j < boomLen; j++){
                    // 폭탄의 길이만큼 비교
                    if(store.get(store.size() - boomLen + j) == boom.charAt(j)){
                        count++;
                    }

                    if(count == boomLen){
                        for(int p = 0; p < boomLen; p++){
                            store.pop();
                        }
                    }
                }
            }
        }

        if(store.isEmpty()){
            System.out.println("FRULA");
        }else{
            for(char result : store){
                output.append(result);
            }
            System.out.println(output.toString());
        }

        
        
    }
}