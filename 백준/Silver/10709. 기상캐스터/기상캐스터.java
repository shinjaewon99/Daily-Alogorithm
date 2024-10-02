import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int w = in.nextInt();

        char[][] store = new char[h][w];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < h; i++){
            String word = in.next();
            for(int j = 0; j < w; j++){
                store[i][j] = word.charAt(j);
            }
        }

        for(int i = 0; i < h; i++){
            int count = 0;

            // 구름이 있는 경우
            for(int j = 0; j < w; j++){
                if(store[i][j] == 'c'){
                    count = 1;
                    sb.append("0 ");
                }else if(store[i][j] == '.'){
                    if(count != 0){
                        sb.append(count).append(" ");
                        count++;
                    }else{
                        sb.append("-1 ");
                    }
                }
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
