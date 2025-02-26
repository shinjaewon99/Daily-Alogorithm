import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 갯수
        in.nextLine();

         while (t-- > 0) {
            String word = in.nextLine();
            int n = (int) Math.sqrt(word.length()); // 정사각형 한 변 길이

            char[][] graph = new char[n][n];

            // 세로방향 문자 채우기
             int index = 0;
            for(int i = 0; i < n; i++){
                for(int j = n - 1; j >= 0; j--){
                    graph[j][i] = word.charAt(index++);
                }
            }

            // 가로방향 채우기
             StringBuilder output = new StringBuilder();
             for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    output.append(graph[i][j]);
                }
            }

             System.out.println(output.toString());
         }

    }
}