import java.util.*;

class Main {
    private static int n;
    private static int[] numbers;
    private static boolean[] visit;
    private static int result = Integer.MIN_VALUE;
    private static List<Integer> store = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        numbers = new int[n];
        visit = new boolean[n];

        for(int i = 0; i < n; i++){
            numbers[i] = in.nextInt();
        }

        back(0);

        System.out.print(result);
    }

    private static void back(int depth){
        if(depth == n){
            result = Math.max(result, getMax());
            return;
        }

        for(int i = 0; i < n; i++){
            // 방문 하지 않았으면
            if(!visit[i]){
                visit[i] = true;
                store.add(numbers[i]);
                back(depth + 1);

                visit[i] = false; // 원래 상태로 되돌림
                store.remove(store.size() - 1);
                
            }
        }
    }

    private static int getMax(){
        int sum = 0;

        for(int i = 0; i < n - 1; i++){
            sum += Math.abs(store.get(i) - store.get(i + 1));
        }

        return sum;
    }
}