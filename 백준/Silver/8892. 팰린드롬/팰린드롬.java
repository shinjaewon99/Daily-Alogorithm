import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = in.nextInt(); // 테스트 개수

        while (t-- > 0) {
            int k = in.nextInt();
            in.nextLine();

            List<String> words = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                words.add(in.nextLine());
            }

            sb.append(find(words)).append("\n");
        }
        
        System.out.println(sb);
    }

    private static String find(List<String> words) {
        int n = words.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue; // 같은 단어를 조합하는 경우 제외

                String combined = words.get(i) + words.get(j);
                if (isPalindrome(combined)) {
                    return combined;
                }
            }
        }
        return "0";
    }

    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
