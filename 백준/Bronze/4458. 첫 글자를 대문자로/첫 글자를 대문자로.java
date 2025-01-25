import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 갯수
        in.nextLine();
        
        for(int i = 0; i < t; i++){
            String word = in.nextLine();
            System.out.println(bigWord(word));
        }
    }

    private static String bigWord(String word){
        if(word.length() == 0) return word;
        char first = word.charAt(0); // 첫번째 글자

        first = Character.toUpperCase(first);

        return first + word.substring(1); // 나머지 글자 붙이기
    }
}
