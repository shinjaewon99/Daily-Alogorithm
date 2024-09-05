import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(in.readLine());

        for (int i = 0; i < testCase; i++) {
            String numbers = in.readLine();
            
            StringTokenizer st = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(st.nextToken()); // 세준 병사 수
            int m = Integer.parseInt(st.nextToken()); // 세비 병사 수

            int jMax = 0; 
            int bMax = 0; 

       
            st = new StringTokenizer(in.readLine());
            for (int j = 0; j < n; j++) {
                int number = Integer.parseInt(st.nextToken());
                jMax = Math.max(jMax, number);
            }

            st = new StringTokenizer(in.readLine());
            for (int j = 0; j < m; j++) {
                int number = Integer.parseInt(st.nextToken());
                bMax = Math.max(bMax, number);
            }

            // 승자를 출력
            if (jMax > bMax) {
                System.out.println("S"); 
            } else if (jMax < bMax) {
                System.out.println("B");
            } else {
                System.out.println("S");
            }
        }

        in.close(); // BufferedReader 닫기
    }
}
