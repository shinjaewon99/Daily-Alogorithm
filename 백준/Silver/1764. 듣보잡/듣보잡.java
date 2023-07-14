import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int n = in.nextInt(); // 듣도 못한 사람의 수
        int m = in.nextInt(); // 보도 못한 사람의 수
        for (int i = 0; i < n; i++) {
            String name = in.next();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String name = in.next();
            map.put(name, map.getOrDefault(name, 0) + 1);
            
            // value 값이 2보다 크면 듣도보도 못한 사람이다.
            if(map.get(name) >= 2){
                integerList.add(map.get(name));
                stringList.add(name);
            }
        }

        Collections.sort(stringList); // 오름차순 정렬
        System.out.println(integerList.size());
        for (String result : stringList) {
            System.out.println(result);
        }
    }
}
