import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 숫자 갯수
        Set<String> set = new HashSet<>();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.next();
        }
        int length = arr[0].length(); // 초기 길이

        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < n; j++) {
                set.add(arr[j].substring(length - i));
            }
            if (set.size() == n) {
                System.out.println(i);
                return;
            }

            set.clear();
        }
    }
}
