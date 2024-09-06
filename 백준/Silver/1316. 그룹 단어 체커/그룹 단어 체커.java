import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        in.nextLine();
        int count = 0;
        
        for(int i = 0; i < number; i++){
            String word = in.nextLine();

            if(check(word)) count++;
        }

        System.out.println(count);
    }
    
    private static boolean check(String word) {
        boolean[] store = new boolean[26]; // 논리 배열의 초기값은 false

        // 연속된 문자인지 판단
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);

            if(store[ch - 'a']){
                // 연속되지 않은 문자열 일경우
                if(ch != word.charAt(i - 1)){
                    return false;
                }
            }else {
                store[ch - 'a'] = true;
            }
        }
        return true;
    }
}
