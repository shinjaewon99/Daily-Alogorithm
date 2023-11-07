import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int h = in.nextInt();
        int w = in.nextInt();
        char[][] arr = new char[h][w];
        StringBuilder output = new StringBuilder();

        // 1. 행과열의 길이만큼 arr배열에 할당
        for (int i = 0; i < h; i++) {
            String input = in.next();
            for (int j = 0; j < w; j++) {
                arr[i][j] = input.charAt(j);
            }
        }

        // 2. arr 배열 탐색
        for (int i = 0; i < h; i++) {
            int count = 0;
            for (int j = 0; j < w; j++) {
                // 3. 구름이 있는경우
                if (arr[i][j] == 'c') {
                    count = 1;
                    output.append("0 ");
                }else if (arr[i][j] == '.'){
                    if(count == 0){
                        output.append("-1 ");
                    }else{
                        output.append(count).append(" ");
                        count++;
                    }
                }
            }
            output.append("\n");
        }
        System.out.println(output.toString());
    }
}
