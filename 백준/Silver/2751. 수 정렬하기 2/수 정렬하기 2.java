import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());

        }


        Collections.sort(list);

        for (Integer integer : list) {
            sb.append(integer).append("\n");
        }
        System.out.println(sb);

    }
}
