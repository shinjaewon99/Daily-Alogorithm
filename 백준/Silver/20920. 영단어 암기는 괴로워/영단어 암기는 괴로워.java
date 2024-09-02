import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int loop = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());

        Map<String, Integer> store = new HashMap();
        
        for(int i = 0; i < loop; i++){
            String word = in.readLine();
            
            if(word.length() >= length){
                store.put(word, store.getOrDefault(word, 0) + 1);
            }
        }
       
        List<String> sortWord = new ArrayList<>(store.keySet());
        
        sortWord.sort((a, b) -> {
           // 빈도수 비교, store.get(b)가 store.get(a)보다 크면 양수 반환
           int freqCompare = store.get(b).compareTo(store.get(a));
            
           if(freqCompare != 0){
               return freqCompare;
           }
           
           // 길이 비교
           int lengthCompare = Integer.compare(b.length(), a.length());
            
           if(lengthCompare != 0){
               return lengthCompare;
           }
           
           return a.compareTo(b);
        });
        
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String word : sortWord) {
            out.write(word);
            out.newLine();
        }
        out.flush();
    }
}