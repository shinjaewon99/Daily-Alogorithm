import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 책의 갯수
        int m = in.nextInt(); // 최대 무게

        if(n == 0) {
            System.out.println(0); 
            return;
        }
        
        int count = 1;
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            int number = in.nextInt();

            // 기준값을 넘기면 새로운 박스 사용
            if(sum + number > m){
                count++;
                sum = 0;
            }

            sum += number;
        }

        System.out.println(count);
    }
}