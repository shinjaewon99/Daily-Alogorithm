import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 파일의 갯수 입력
        int fileSize = in.nextInt();

        // 2. 파일의 갯수만큼 파일 입력
        String[] files = new String[fileSize];
        for (int i = 0; i < fileSize; i++) {
            files[i] = in.next();
        }

        // 3. 파일의 확장자 저장
        Map<String, Integer> store = new HashMap<>();

        for (int i = 0; i < fileSize; i++) {
            String file = files[i];
            String[] commaSplit = file.split("\\.");
            store.put(commaSplit[1], store.getOrDefault(commaSplit[1], 0) + 1);

        }

        // 4. 확장자의 이름순으로 출력
        List<String> comparator = new ArrayList<>(store.keySet());

        // 5. Map 객체에서 List 객체로 담은후, 내림차순 정렬
        Collections.sort(comparator);

        for (int i = 0; i < comparator.size(); i++) {
            System.out.println(comparator.get(i) + " " + store.get(comparator.get(i)));
        }
    }
}
