import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 갯수
        
        for(int i = 0; i < t; i++){
            int count = 0;
            int number = in.nextInt();
            int[] numbers = new int[number + 1];

            for(int j = 1; j <= number; j++){
                numbers[j] = in.nextInt();
            }

            boolean[] visit = new boolean[number + 1];

            for(int k = 1; k <= number; k++){
                // 방문하지 않았으면
                if(!visit[k]){
                    visit[k] = true; // 방문처리
                    int next = numbers[k];

                    while(true){
                        if(visit[next]){
                            count++;
                            break;
                        }
                        visit[next] = true;
                        next = numbers[next]; // 다음 노드로 이동
                    }
                }
            }

            System.out.println(count);
        }
    }
}