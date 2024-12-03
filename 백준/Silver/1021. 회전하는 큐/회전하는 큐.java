import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int m = in.nextInt(); // 뽑아낼려고 하는 원소의 수

        Deque<Integer> store = new LinkedList<>();

        for(int i = 1; i <= size; i++){
            store.add(i);
        }

        int[] indexs = new int[m];
        for(int i = 0; i < m; i++){
            indexs[i] = in.nextInt();
        }

        int total = 0;
        
        for(int index : indexs){
            int find = 0;

            for(int number : store){
                if(number == index){
                    break;
                }
                find++;
            }

            // 왼쪽 이동과 오른쪽 이동중 더 작은 이동 횟수를 찾음
            int left = find;
            int right = store.size() - find;

            if(left <= right){
                for(int i = 0; i < left; i++){
                    store.addLast(store.pollFirst()); // 왼쪽 이동
                }
                total += left;
            }else {
                for(int i = 0; i < right; i++){
                    store.addFirst(store.pollLast()); // 오른쪽 이동
                }

                total += right;
            }

            // 1번 연산: 첫 번째 원소 제거
            store.pollFirst();
            
        }
        System.out.println(total);
    }
}