import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.nextLine();
        Map<String, Integer> store = new HashMap<>();
        Queue<String> compare = new LinkedList<>();
        
        for(int i = 0; i < t; i++){
            String[] word = in.nextLine().split(" ");

            store.put(word[0], Integer.parseInt(word[1])); // 학생과 팀원 번호 저장
            compare.add(word[0]);
        }

        while(compare.size() > 1){
            String find = compare.poll(); // 기준이 되는 팀원
            int index = store.get(find); // 기준이 되는 팀원이 찾고자 하는 팀원 인덱스

            // index 번째 팀원을 찾기위해 팀원을 뒤로 미룬다
            for(int i = 0; i < index - 1; i++){
                compare.add(compare.poll());
            }

            compare.poll(); // 찾은 팀원을 꺼냄
        }

        System.out.println(compare.poll()); // 김한양의 최애의 팀원
    }
}