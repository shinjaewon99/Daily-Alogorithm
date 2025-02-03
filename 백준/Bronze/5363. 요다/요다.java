import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();
        
        for(int i = 0 ; i < n; i++){
            String word = in.nextLine();

            System.out.println(getResult(word));
        }
    }

    private static String getResult(String word) {
        StringBuilder output = new StringBuilder();

        String[] words = word.split(" ");
        
        for (int i = 2; i < words.length; i++) {
            output.append(words[i]).append(" ");
        }
        
        // 앞의 두 단어를 마지막에 추가
        output.append(words[0]).append(" ").append(words[1]);
        
        return output.toString();
    }
}