import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.next();
        String compareWord = in.next();
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < compareWord.length() - word.length() + 1; i++){
            int count = 0;

            for(int j = 0; j < word.length(); j++){
                if(word.charAt(j) != compareWord.charAt(i + j)){
                    count++;
                }
            }

            result = Math.min(result, count);
        }

        System.out.println(result);
    }
}