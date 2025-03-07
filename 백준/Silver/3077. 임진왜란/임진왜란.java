import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.nextLine();

        String[] stu = in.nextLine().split(" ");
        String[] answer = in.nextLine().split(" ");

        // 정답 인덱스를 담을 Map 객체
        Map<String,Integer> store = new HashMap<>();

        for(int i = 0; i < t; i++){
            store.put(answer[i], i);
        }

        int[] indexs = new int[t];

        for(int i = 0; i < t; i++){
            indexs[i] = store.get(stu[i]);
        }

        int cnt = 0;

        for(int i = 0; i < t; i++){
            for(int j = i + 1; j < t; j++){
                if(indexs[i] < indexs[j]){
                    cnt++;
                }
            }
        }

        StringBuilder output = new StringBuilder();
        output.append(cnt).append("/").append(t*(t-1)/2);

        System.out.println(output.toString());
    }
}