import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for(int i = 0; i < t; i++){
            Queue<int[]> queue = new LinkedList<>();
            PriorityQueue<Integer> store = new PriorityQueue<>(Collections.reverseOrder());

            int n = in.nextInt(); // 문의 갯수
            int m = in.nextInt(); // 궁금한 문서 번호

            for(int j = 0; j < n; j++){
                int number = in.nextInt();
                queue.add(new int[]{j, number}); // 문서의 위치와 중요도 저장
                store.add(number);
            }

            int printOrder = 0;

            while (!queue.isEmpty()) {
                int[] current = queue.poll();

                // 현재 문서가 우선순위가 최고인지 확인
                if(current[1] == store.peek()){
                    printOrder++;
                    store.poll();

                    // 궁금한 문서 인지 확인
                    if(current[0] == m){
                        System.out.println(printOrder);
                        break;
                    }
                }else {
                    queue.add(current);
                }
            }
        }
    }
}