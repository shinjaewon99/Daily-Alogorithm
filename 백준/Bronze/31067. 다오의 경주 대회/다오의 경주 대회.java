import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] numbers = new int[n];

        for(int i = 0; i < n; i++){
            numbers[i] = in.nextInt();
        }

        int count = 0;
        int compare = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){

            if(numbers[i] > compare){
                compare = numbers[i];
            }
            // 늘릴수 있는 길이 설정 시
            else if(numbers[i] + k > compare){
                count++;
                compare = numbers[i] + k;
            }else{
                System.out.println("-1");
                return;
            }
        }

        System.out.println(count);
    }
}