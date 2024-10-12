import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int[] numbers = new int[number];
    
        int add = 0;
        int result = 0;
        
        for(int i = 0; i < number; i++){
            numbers[i] = in.nextInt();
        }
        
        Arrays.sort(numbers);
        for(int i = 0; i < number; i++){
            add += numbers[i];
            result += add; // 누적합 구하기기
        }
        
        System.out.println(result);
    }
}