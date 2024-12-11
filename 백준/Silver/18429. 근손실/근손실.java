import java.util.*;

class Main {
    private static int n;
    private static int k;
    private static int count;
    private static int[] store;
    private static boolean[] visit;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt(); // 일 수 입력
        k = in.nextInt(); // 운동 키트 입력
        store = new int[n];
        visit = new boolean[n];

        for(int i = 0; i < n; i++){
            store[i] = in.nextInt();
        }
        
        count = 0;
        back(0, 500); // 0번 노드부터 뻗어져 나감
        System.out.println(count);
    }

    private static void back(final int day, final int weight){

        if(n == day){
            count++; // n일동안 만족하는 경우의수 증가
            return;
        }

        for(int i = 0; i < n; i++){
            if(!visit[i]){
                int nextWeight = weight + store[i] - k;
                if(nextWeight >= 500){
                    visit[i] = true;
                    back(day + 1, nextWeight);

                    visit[i] = false; // 복귀
                }
            }
        }
    }
}