import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트의 갯수

        for(int i = 0; i < t; i++){
            int number = in.nextInt();
            int result = getResult(number);

            System.out.println(result);
        }
    }

    private static int getResult(int number){
        Set<Integer> store = new HashSet<>();

        String word = String.valueOf(number);

        String[] words = word.split("");

        for(int i = 0; i < words.length; i++){
            store.add(Integer.valueOf(words[i]));
        }

        return store.size();
    }
}