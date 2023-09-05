import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // 1. 입력된 두개의 정수 만큼 이중 반복문을 사용하여 문자를 찍습니다.
        for(int i = 0; i < b; i++){
            // 2. 입력된 a가 행이라고 생각
            for(int j = 0; j < a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}