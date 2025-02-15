import java.util.*;

class Main {
    private static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int t = in.nextInt(); // 테스트 갯수

        for(int i = 0; i < t; i++){
            int n = in.nextInt(); // 후보자 수
            getResult(n);
        }
    }

    private static void getResult(int n){
        int[] votes = new int[n + 1];
        int max = 0;
        int index = 0;
        int total = 0;
        boolean isCheck = false;

        for(int i = 1; i <= n; i++){
            votes[i] = in.nextInt();
            total += votes[i];
            
            if(votes[i] > max){
                max = votes[i];
                index = i;
                isCheck = false;
            }else if (votes[i] == max){
                isCheck = true;
            }
        }
        if (isCheck) {
            System.out.println("no winner");
        } else if (max > total / 2) { // 과반수 확인
            System.out.println("majority winner " + index);
        } else {
            System.out.println("minority winner " + index);
        }
    }
}