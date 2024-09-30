import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();

        List<String> store = new ArrayList<>();
        
        for(int i = 1; i < word.length(); i++){
            for(int j = i + 1; j < word.length(); j++){
                String result = calcWord(word, i, j);
                store.add(result);
            }
        }

        Collections.sort(store);
        System.out.println(store.get(0));
    }

    // 문자열 경우의 수를 모두 저장하는 메소드드
    private static String calcWord(final String compare, final int i, final int j){
        StringBuilder sub1 = new StringBuilder(compare.substring(0, i));
        StringBuilder sub2 = new StringBuilder(compare.substring(i, j));
        StringBuilder sub3 = new StringBuilder(compare.substring(j));

        StringBuilder sb = new StringBuilder();

        sb.append(sub1.reverse()).append(sub2.reverse()).append(sub3.reverse());

        return sb.toString();
    }
}
