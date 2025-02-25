import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 단어의 갯수
        in.nextLine();
        Set<String> result = new HashSet<>();

        for(int i = 0; i < n; i++){
            String word = in.nextLine();
            result.add(getResult(word));
        }

        System.out.println(result.size());
    }

    private static String getResult(String word){
        String basic = word;
        String compare = word + word;

        for(int i = 1; i <= word.length(); i++){
            String w = compare.substring(i, i + word.length());

            // 0보다 작은경우 = 현재 문자열이 사전순으로 앞에있음
            if(basic.compareTo(w) < 0){
                basic = w;
            }
        }
        return basic;
        
    }
    
}