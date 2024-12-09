import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        in.nextLine();

        List<String> store = new ArrayList<>();
        for(int i = 0; i < test; i++){
            String serial = in.nextLine();
            store.add(serial);
        }

        // 정렬로직
        store.sort((w1, w2) -> {
            // 1. 길이비교
            if(w1.length() != w2.length()){
                return Integer.compare(w1.length(), w2.length());
            }

            // 2. 숫자의 합 비교
            int total1 = getSum(w1);
            int total2 = getSum(w2);

            if(total1 != total2){
                return Integer.compare(total1, total2);
            }

            // 3. 사전순 비교
            return w1.compareTo(w2);
        });

        for(String result : store){
            System.out.println(result);
        }
    }

    private static int getSum(final String word) {
        int total = 0;
        
        for(char ch : word.toCharArray()){
            if(Character.isDigit(ch)){
                total += ch - '0';
            }
        }

        return total;
    }
}
