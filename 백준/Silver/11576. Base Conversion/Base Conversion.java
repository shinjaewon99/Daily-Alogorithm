import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); // 미래의 진법
        int b = Integer.parseInt(st.nextToken()); // 정이가 사용하는 진법
        int m = Integer.parseInt(br.readLine()); // 자릿수의 갯수

        st = new StringTokenizer(br.readLine());
        int result = 0;

        // A진법을 10진법으로 변환
        for(int i = 0; i < m; i++){
            int number = Integer.parseInt(st.nextToken());
            result += number * Math.pow(a, m - 1 - i);
        }

        // 10진법에서 B진법으로 변환
        List<Integer> store = new ArrayList<>();
        while(result > 0){

            store.add(result % b);
            result /= b;
        }

        for(int i = store.size() - 1; i >= 0; i--){
            System.out.print(store.get(i) + " ");
        }
    }
}
