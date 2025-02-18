import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 갯수

        while(t --> 0){
            int n = in.nextInt(); // 오셀로 말의 갯수

            String start = in.next();
            String target = in.next();

            int count1 = 0; // W -> B로 바꿔야 하는 경우
            int count2 = 0; // B -> W로 바꿔야 하는 경우

            for (int i = 0; i < n; i++) {
                if (start.charAt(i) == 'W' && target.charAt(i) == 'B') {
                    count1++;
                } else if (start.charAt(i) == 'B' && target.charAt(i) == 'W') {
                    count2++;
                }
            }

            int result1 = Math.min(count1, count2); // 위치 교환으로 해결 가능 개수
            int result2 = Math.abs(count1 - count2); // 남은 개수는 뒤집기로 해결
            
            System.out.println(result1 + result2);
        }
    }
}