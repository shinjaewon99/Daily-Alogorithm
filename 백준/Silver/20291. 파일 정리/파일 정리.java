import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt(); // 파일의 갯수
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String[] file = in.next().split("\\."); // "."을 기준으로 split을 한다
            map.put(file[1], map.getOrDefault(file[1], 0) + 1); // Map 객체에 file[1] 문자열이 없을 경우 0, 있을경우 누적합

        }

        List<String> list = new ArrayList<>(map.keySet()); // List 객체에 Map의 key값을 담아준다.
        Collections.sort(list);


        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " " + map.get(list.get(i))); // list 반환, map의 key값에 해당하는 value값 반환
            System.out.println();
        }


    }
}
