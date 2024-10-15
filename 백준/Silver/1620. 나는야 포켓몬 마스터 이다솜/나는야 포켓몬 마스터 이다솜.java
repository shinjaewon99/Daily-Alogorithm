import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int findNum = in.nextInt();
        Map<String, String> map = new HashMap<>();


        for (int i = 0; i < size; i++) {
            String poket = in.next();
            String count = Integer.toString(i + 1);

            map.put(poket, count);
            map.put(count, poket);
        }

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < findNum; i++) {
            String find = in.next();
            output.append(map.get(find)).append("\n");
        }

        System.out.print(output.toString());



    }
}
