import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int l = in.nextInt(); // 롤케이크 숫자
        int n = in.nextInt(); // 방청객의 숫자

        int mayCnt = 0; // 많이 받을것을 기대
        int mayPerson = 0; //   방청객 번호

        int[] cake = new int[l + 1];
        int[] get = new int[n + 1];
        
        for(int i = 1; i <= n; i++){
            int p = in.nextInt();
            int k = in.nextInt();

            int result  = k - p + 1; // 기대한 조각 수

            if(result > mayCnt){
                mayCnt = result;
                mayPerson = i;
            }

            for(int j = p; j <= k; j++){
                // 아직 방문하지 않은 케이크
                if(cake[j] == 0){
                    cake[j] = i;
                    get[i]++;
                }
            }
            
        }
        
        int realCnt = 0; // 실제 갯수
        int realPerson = 0; // 실제 방척객

        for(int i = 1; i <= n; i++){
            if(get[i] > realCnt){
                realCnt = get[i];
                realPerson = i;
            }
        }

        System.out.println(mayPerson);
        System.out.println(realPerson);
    }
}