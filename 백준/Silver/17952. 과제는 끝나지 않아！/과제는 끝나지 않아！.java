import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        Stack<int[]> store = new Stack<>();
        int result = 0;

        for(int i = 0; i < n; i++){
            int type = in.nextInt();

            if(type == 1){
                int score = in.nextInt();
                int cnt = in.nextInt() - 1; // 1분 소요

                if(cnt == 0){
                    result += score;
                }else{
                    store.push(new int[]{score, cnt});
                }
            }
            // 진행중인 과제가 있다면
            else if(!store.isEmpty()){
                store.peek()[1]--;

                // 과제가 완료됐다면
                if(store.peek()[1] == 0){
                    result += store.pop()[0];
                }
            }
        }

        System.out.println(result);
    }
}
