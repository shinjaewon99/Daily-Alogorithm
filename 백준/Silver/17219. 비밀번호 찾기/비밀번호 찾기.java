import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 입력할 사이트 수 
        int m = Integer.parseInt(st.nextToken()); // pw를 찾을 사이트
        
        Map<String, String> store = new HashMap<>();
    
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String pw = st.nextToken();
            store.put(site, pw);
        }

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < m; i++){
            String word = br.readLine();
            String pw = store.get(word);
            result.append(pw).append("\n");
        }

        System.out.println(result.toString());
    }
}