import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        String word = in.nextLine();

        int count = 0;

        for (int i = 0; i <= n - 4;) {
            if (word.charAt(i) == 'p' &&
                word.charAt(i + 1) == 'P' &&
                word.charAt(i + 2) == 'A' &&
                word.charAt(i + 3) == 'p') {
                count++;
                i += 4;  // 겹치지 않도록 4칸 건너뛰기
            } else {
                i++;    // 패턴이 없으면 한 칸만 이동
            }
        }

        System.out.println(count);
    }
}