/*
문제
김진영이 듣도 못한 사람의 명단과, 보도 못한 사람의 명단이 주어질 때, 듣도 보도 못한 사람의 명단을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다. 이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다. 이름은 띄어쓰기 없이 알파벳 소문자로만 이루어지며, 그 길이는 20 이하이다. N, M은 500,000 이하의 자연수이다.

듣도 못한 사람의 명단에는 중복되는 이름이 없으며, 보도 못한 사람의 명단도 마찬가지이다.

출력
듣보잡의 수와 그 명단을 사전순으로 출력한다.

예제 입력 1
3 4
ohhenrie
charlie
baesangwook
obama
baesangwook
ohhenrie
clinton
예제 출력 1
2
baesangwook
ohhenrie
*/

import java.util.*;

public class problem201 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 듣도못한 사람
        int m = in.nextInt(); // 보도못한 사람

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String a = in.next();
            map1.put(a, i);
        }

        for (int i = 0; i < m; i++) {
            String a = in.next();
            map2.put(a, i);
        }

        List<String> result = new ArrayList<>();

        // key값을 비교
        for (String st : map1.keySet()) {
            if (map2.containsKey(st)) {
                result.add(st);
            }
        }
        // 사전순으로 정렬
        Collections.sort(result);

        System.out.println(result.size());

        for (String s : result) {
            System.out.println(s);
        }


    }
}