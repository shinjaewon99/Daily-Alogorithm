import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(in.readLine());
        
        int number = Integer.parseInt(st.nextToken());
        int find = Integer.parseInt(st.nextToken());

        int[] store = new int[number];

        st = new StringTokenizer(in.readLine());
        for(int i = 0; i < number; i++){
            store[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(store);

        System.out.println(store[find - 1]);
    }
}
