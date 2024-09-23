import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        long number = Long.parseLong(in.readLine());

        List<Long> store = new ArrayList<>();
        
        for(int i = 0; i < number; i++){
            store.add(Long.parseLong(in.readLine()));
        }

        Collections.sort(store, Collections.reverseOrder());

        for(long result : store){
            sb.append(result).append("\n");
        }


        out.write(sb.toString());
        out.flush();  // 출력 후 flush
        out.close(); 
       
    }
}
