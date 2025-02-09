import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 선의 갯수
        List<int[]> store = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            store.add(new int[]{x, y});
        }

        // 시작점을 기준으로 정렬
        store.sort(Comparator.comparingInt(a -> a[0]));


        int total = 0;
        int start = store.get(0)[0];
        int end = store.get(0)[1];

        for(int i = 1; i < n; i++){
            int[] line = store.get(i);

            // 겹치는 경우
            if(line[0] <= end){
                // 끝값을 최대값으로 갱신
                end = Math.max(end, line[1]);
            }else{
                total += end - start;
                start = line[0];
                end = line[1];
            }
        }

        // 마지막 남은 선분 더하기
        total += end - start;
        
        System.out.println(total);
    }
}