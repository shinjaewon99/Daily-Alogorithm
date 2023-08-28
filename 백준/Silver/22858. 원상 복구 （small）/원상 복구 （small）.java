import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 카드의 갯수 N 입력
        int cardSize = in.nextInt();

        // 2. 카드를 섞은 횟수 K 입력
        int supple = in.nextInt();

        // 3. 카드의 갯수만큼 정수 입력
        int[] cards = new int[cardSize + 1];
        int[] compare = new int[cardSize + 1];

        for (int i = 1; i <= cardSize; i++) {
            cards[i] = in.nextInt();
        }
        for (int i = 1; i <= cardSize; i++) {
            compare[i] = in.nextInt();
        }

        // 4. supple번 만큼 섞습니다.
        // 3 5 1 4 2
        // 1 4 5 3 2
        for (int i = 0; i < supple; i++) {
            int[] temp = new int[cardSize + 1];
            for (int j = 1; j <= cardSize; j++) {
                temp[compare[j]] = cards[j];
            }
            cards = temp; // 섞은 카드 재 할당
        }
        
        for (int i = 1; i <= cardSize; i++) {
            System.out.print(cards[i] + " ");
        }
    }
}
