import java.util.*;

class Main {
    static int num;
    static int[] numbers;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        numbers = new int[num + 1];
        
        for(int i = 1; i <= num; i++){
            numbers[i] = in.nextInt();
        }

        int student = in.nextInt();
        for(int i = 0; i < student; i++){
            int divStudent = in.nextInt();
            int compare = in.nextInt();
            changeMan(divStudent, compare);
            changeGirl(divStudent, compare);
        }

        for(int i = 1; i <= num; i++){
            System.out.print(numbers[i] + " ");

            // 20개씩 출력하기 위함
            if(i % 20 == 0){
                System.out.println();
            }
        }
        
    }

    // 남학생인 경우
    private static void changeMan(final int student, final int divNum){
        if(student == 1){
            for(int i = divNum; i <= num; i+= divNum){
                if(numbers[i] == 1){
                    numbers[i] = 0;
                }else{
                    numbers[i] = 1;
                }
            }
        }
    }
    
    // 여학생인 경우
    private static void changeGirl(final int student, final int divNum){
        if(student == 2){
            // 이진 탐색
            int left = divNum - 1;
            int right = divNum + 1;
    
            // 어디까지 같은지 확인
            while(left >= 1 && right <= num){
    
                if(numbers[left] != numbers[right]){
                    break;
                }
                
                left--;
                right++;
            }
    
            // while문에서 left와 right의 값이 감소 혹은 증가한 상태로 탈출 하기 때문
            for(int i = left + 1; i < right; i++){
                 if(numbers[i] == 1){
                    numbers[i] = 0;
                }else{
                    numbers[i] = 1;
                }
            }
        }
    }
}