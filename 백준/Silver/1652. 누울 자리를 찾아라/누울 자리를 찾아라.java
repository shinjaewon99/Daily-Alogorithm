import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.nextLine();

        int countA = 0; // 누울 수 있는 가로
        int countB = 0; // 누울 수 있는 세로
        
        char[][] graph = new char[number][number];


        // 1. 입력 받기
        for(int i = 0; i < number; i++){
            String word = in.nextLine();
            for(int j = 0; j < number; j++){
                graph[i][j] = word.charAt(j);
            }
        }

        for(int i = 0; i < number; i++){
            int h = 0;
            int v = 0;
            for(int j = 0; j < number; j++){

                if(graph[i][j] == '.'){
                    h++;
                }

                /** 
                    2
                    ..
                    .. 입력값 위한 마지막 index처리
                **/
                if(graph[i][j] == 'X' || (j == number - 1)){
                    if(h >= 2){
                        countA++;
                    }
                    // X를 만났을경우 0으로 초기화
                    h = 0;
                }

                if(graph[j][i] == '.'){
                    v++;
                }

                if(graph[j][i] == 'X' || (j == number - 1)){
                    if(v >= 2){
                        countB++;
                    }
                    // X를 만났을경우 0으로 초기화
                    v = 0;
                }
            }
        }

        System.out.println(countA + " " + countB);

        
    }
}
