import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (size-- > 0) {

            int cow = in.nextInt(); // 소의 번호
            int location = in.nextInt(); // 소의 위치

            // 중복된 소 검증
            if (!map.containsKey(cow)) {
                map.put(cow, location);
            } else {
                // 등록된 소의 위치가 변동 되었는지 확인
                if (map.get(cow) != location) {
                    count++;
                }
                map.put(cow, location); // 새로운 위치 할당
            }
        }
        System.out.println(count);
    }
}
