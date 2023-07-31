import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 사람의 수 입력
        int num = in.nextInt();

        // 2. 각 사람이 주려고 하는 팁
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(in.nextInt());
        }

        // 3. 강호가 받을수 있는 팁 최대값 구하기
        list.sort(Collections.reverseOrder());
        long result = 0;
        int index = 0;
        for (int i = 1; i <= num; i++) {
            int temp = list.get(index) - (i - 1);

            if (temp <= 0) {
                temp = 0;
            }
            result += temp;
            index++;
        }
        System.out.println(result);

    }
}
