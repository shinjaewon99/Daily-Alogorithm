import java.util.*;

class Main {
    private static int[] numbers;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        numbers = new int[t];
        for(int i = 0; i < t; i++){
            numbers[i] = in.nextInt();
        }

        // 이전 순열을 확인
        if(reverseArr()){
            for(int result : numbers){
                System.out.print(result + " ");
            }
        }else{
            System.out.println("-1");
        }
    }

    // 1 2 3 4
    private static boolean reverseArr(){
        int index = numbers.length - 1;

        // 맨 첫번째 수열인지 확인
        while(index > 0 && numbers[index - 1] <= numbers[index]){
            index--;
        }

        if(index < 1){
            return false;
        }

        int j = numbers.length - 1;
        while(numbers[index-1] <= numbers[j]) {
            j--;
        }
        
        swap(index-1, j);    // 자리 바꾸기
        
        j = numbers.length-1;
        
        while(index < j) {
            swap(index, j);
            index++;
            j--;
        }
        return true;
    }

    private static void swap(int n , int m){
        int temp = numbers[n];
        numbers[n] = numbers[m];
        numbers[m] = temp;
    }
    
}