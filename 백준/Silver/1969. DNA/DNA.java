import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // DNA의 수
        int m = in.nextInt(); // 문자열의 길이
        in.nextLine();
        
        String[] inputStore = new String[n];
        
        for (int i = 0; i < n; i++) {
            inputStore[i] = in.nextLine();
        }

        StringBuilder output = new StringBuilder();
        int result = 0;

        for (int i = 0; i < m; i++) {
            int[] cnt = new int[4]; // A, C, G, T 갯수 카운트

            for (int j = 0; j < n; j++) {
                char compare = inputStore[j].charAt(i);
                switch (compare) {
                    case 'A':
                        cnt[0]++; break;
                    case 'C':
                        cnt[1]++; break;
                    case 'G':
                        cnt[2]++; break;
                    case 'T':
                        cnt[3]++; break;
                }
            }

            int maxCount = 0;
            char maxWord = 'A';
            char[] bindAlpha = {'A', 'C', 'G', 'T'};
            for (int k = 0; k < 4; k++) {
                if (cnt[k] > maxCount) {
                    maxCount = cnt[k];
                    maxWord = bindAlpha[k];
                }
            }

            output.append(maxWord);
            result += (n - maxCount);
        }

        System.out.println(output.toString());
        System.out.println(result);
    }
}
