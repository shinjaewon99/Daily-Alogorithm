import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 갯수

        for(int i = 0; i < t; i++){
            int[] numbers = new int[5];

            for(int j = 0; j < 5; j++){
                numbers[j] = in.nextInt();
            }

            Arrays.sort(numbers);

            int sum = numbers[1] + numbers[2] + numbers[3];

            if(numbers[3] - numbers[1] >= 4){
                System.out.println("KIN");
            }else{
                System.out.println(sum);
            }
        }
        
    }
}