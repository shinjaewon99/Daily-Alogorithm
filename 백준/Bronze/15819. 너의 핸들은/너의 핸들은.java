import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 핸들의 갯수
        int find = in.nextInt();
        in.nextLine();
        String[] words = new String[n];

        for(int i = 0; i < n; i++){
            words[i] = in.nextLine();
        }

        Arrays.sort(words);

        System.out.println(words[find - 1]);
    }
}
