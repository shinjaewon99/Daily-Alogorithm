import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int[] numbers = new int[number];

        for(int i = 0; i < number; i++){
            numbers[i] = in.nextInt();
        }

        // 가장 긴 길이 (최소 1)
        int maxLength = 1;
        // 값이 커지는 경우
        int up = 1;
        // 값이 작아지는 경우
        int down = 1;

        for(int i = 1; i < number; i++){

            if(numbers[i] >= numbers[i - 1]){
                up++;
            }else{
                up = 1; // 1로 초기화
            }

            if(numbers[i] <= numbers[i - 1]){
                down++;
            }else{
                down = 1;
            }

            maxLength = Math.max(maxLength, Math.max(up, down));
        }

        System.out.println(maxLength);
    }
}