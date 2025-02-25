import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // 테스트 케이스 개수
        in.nextLine();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            Map<Integer, Integer> store = new HashMap<>();
            StringBuilder output = new StringBuilder();
            
            String[] arr1 = new String[n];
            String[] arr2 = new String[n];
            String[] result = new String[n];

            for(int j = 0; j < n; j++){
                arr1[j] = in.next();
            }

            for(int j = 0; j < n; j++){
                arr2[j] = in.next();
            }

            for(int j = 0; j < n; j++){
                result[j] = in.next();
            }

             for(int k = 0; k < n; k++){
                for(int p = 0; p < n; p++){
                    if(arr1[k].equals(arr2[p]))
                        store.put(k, p);
                }
            }

            for (int index : store.values()) {
                output.append(result[index]).append(" ");
            }

            System.out.println(output.toString());
        }
    }
}
