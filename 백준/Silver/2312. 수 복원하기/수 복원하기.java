import java.util.*;
class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();  // 테스트 케이스의 수
        StringBuilder output = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            int number = in.nextInt();
            for(int j = 2; j <= number; j++){
                int cnt = 0;
                
                // 소인수 일 경우
                while(number % j == 0){
                    number /= j;
                    cnt++;
                }

                if(cnt != 0){
                    output.append(j).append(" ").append(cnt).append("\n");
                }
                if(number == 0)break;
            }
        }
        System.out.println(output.toString());
    }
}