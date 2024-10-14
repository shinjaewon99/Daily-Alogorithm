import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(in.readLine());
        int[] sang = new int[size];
        Map<Integer, Integer> map = new HashMap<>();
        String[] sangArr = in.readLine().split(" ");

        for (int i = 0; i < size; i++) {
            sang[i] = Integer.parseInt(sangArr[i]);

            // key값 (상근이 숫자)가 있는경우 누적 + 1,
            map.put(sang[i], map.getOrDefault(sang[i], 0) + 1);
        }

        int compareSize = Integer.parseInt(in.readLine());
        int[] compareArr = new int[compareSize];
        String[] compare = in.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < compareSize; i++) {
            compareArr[i] = Integer.parseInt(compare[i]);

            // map 객체에 비교한 값이 있는경우
            if (map.containsKey(compareArr[i])) {
                sb.append(map.get(compareArr[i])).append(" ");
            } else {
                sb.append("0").append(" ");
            }
        }
        System.out.print(sb.toString());
    }
}