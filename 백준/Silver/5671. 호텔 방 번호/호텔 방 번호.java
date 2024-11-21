import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int start = in.nextInt();
            int end = in.nextInt();

            int count = 0;

            for(int i = start; i <= end; i++){
                if(isUnique(i)){
                    count++;
                }
            }

            System.out.println(count);
        }
    }

    private static boolean isUnique(int number){
        boolean[] numbers = new boolean[10];
        
        while(number > 0){
            int temp = number % 10;
          
            // 이미 등장한 숫자면 false
            if(numbers[temp]){
                return false;
            }
            numbers[temp] = true;
            number /= 10; // 다음 자릿수로 이동
        }
        return true;
    }
}