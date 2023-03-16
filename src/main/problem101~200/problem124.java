/*
학급 회장
문제 설명
학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요. 반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.

출력
▣ 입력설명
첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.
두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.

▣ 출력설명
학급 회장으로 선택된 기호를 출력합니다.

▣ 입력예제 1
15
BACBACCACCBDEDE

▣ 출력예제 1
C
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class problem124 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        Map<Character, Integer> map = new HashMap<>();

        String m = in.next();

        for (int i = 0; i < size; i++) {
            char ch = m.charAt(i);
            // map의 값을 담고, key값이 존재하지 않으면 0으로 반환
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        char solution = ' ';
        // key값을 찾아 for each문으로 돌린후, value값을 찾아 비교를한다.
        for (char c : map.keySet()) {
            int result = map.get(c);

            if (result > max) {
                max = result;
                solution = c;

            }
        }
        System.out.print(solution);
    }
}



