import java.util.Scanner;

public class Main {

    static int[] lightCondition;
    static int lightSize;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        lightSize = in.nextInt(); // 스위치의 갯수
        lightCondition = new int[lightSize + 1]; // 스위치의 상태

        for (int i = 1; i <= lightSize; i++) {
            lightCondition[i] = in.nextInt();
        }

        int number = in.nextInt(); // 학생수
        for (int i = 0; i < number; i++) {
            int student = in.nextInt(); // 학생 성별
            int studentNum = in.nextInt(); // 학생이 받은 수
            changeMan(student, studentNum);
            changeGirl(student, studentNum);
        }

        // 0 1 1 1 0 1 0 1
        for (int i = 1; i <= lightSize; i++) {
            System.out.print(lightCondition[i] + " ");
            if(i % 20 == 0){
                System.out.println(); // 20개씩 출력하기위해 줄바꿈
            }
        }
    }

    // 남학생일 경우
    private static void changeMan(int student, int studentNum) {
        if (student == 1) {
            for (int i = studentNum; i <= lightSize; i += studentNum) {
                if (lightCondition[i] == 1) {
                    lightCondition[i] = 0;
                } else {
                    lightCondition[i] = 1;
                }
            }
        }
    }

    // 여학생일 경우
    private static void changeGirl(int student, int studentNum) {
        if (student == 2) {
            // 이진 탐색을 위한 left, right
            int left = studentNum - 1;
            int right = studentNum + 1;

            while (left >= 1 && right <= lightSize) {
                // 대칭인 스위치가 다른경우
                if (lightCondition[left] != lightCondition[right]) {
                    break;
                }
                left--;
                right++;
            }

            // right 까지인 이유는 while문을 돌며 검증하는 과정에서 right 값이 1 더 증가하게됩니다.
            for (int i = left + 1; i < right; i++) {
                if (lightCondition[i] == 1) {
                    lightCondition[i] = 0;
                } else {
                    lightCondition[i] = 1;
                }
            }
        }
    }

}
