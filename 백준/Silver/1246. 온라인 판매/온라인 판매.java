import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 총달걀 입력
        int egg = in.nextInt();

        // 2. 고객 입력
        int people = in.nextInt();

        List<Integer> store = new ArrayList<>();

        for (int i = 0; i < people; i++) {
            store.add(in.nextInt());
        }

        Collections.sort(store);

        int price = 0;
        int max = 0;
        // 2 7 8 10
        for (int i = 0; i < people; i++) {
            int number = store.get(i);
            int total = 0;

            // 3. 총 달걀이 구매 고객 보다 큰경우, 똑같은 고객에게 2개이상 팔지 않음으로 people - i를 해준다.
            if (egg > people - i) {
                total = number * (people - i);
            }
            // 4. 구매 고객이 총 달걀 갯수 보다 많을경우 달걀을 다 팔아야함
            else {
                total = number * egg;
            }

            if (total > max) {
                max = total;
                price = number;
            }
        }

        System.out.println(price + " " + max);
    }
}
