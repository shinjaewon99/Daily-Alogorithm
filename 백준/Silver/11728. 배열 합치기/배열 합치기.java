import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] storeA = new int[n];
        int[] storeB = new int[m];

        st = new StringTokenizer(in.readLine());
        for (int i = 0; i < n; i++) {
            storeA[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(in.readLine());
        for (int i = 0; i < m; i++) {
            storeB[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = new int[n + m];
        
        // 투포인터 선언
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < n && j < m){
            if(storeA[i] <= storeB[j]){
                result[k++] = storeA[i++]; 
            }else{
                result[k++] = storeB[j++];
            }
        }

        // 남은 요소 처리
        while(i < n){
            result[k++] = storeA[i++];
        }

        while(j < m){
            result[k++] = storeB[j++];
        }

        // 마지막 숫자뒤에 공백을 제거하기위한 StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int idx = 0; idx < result.length; idx++) {
            if (idx > 0) {
                sb.append(" ");
            }
            sb.append(result[idx]);
        }
        out.write(sb.toString());
        out.flush();
    }
}
