import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            String word = in.nextLine();
            if(word.equals("*")) break;

            Set<Character> store = new HashSet<>();

            // 모든 소문자 알파벳 저장
            for(char ch : word.toCharArray()){
                if (ch >= 'a' && ch <= 'z') {
                    store.add(ch);
                }
            }

            if(store.size() == 26){
                System.out.println("Y");
            }else{
                System.out.println("N");
            }
        }
    }
}