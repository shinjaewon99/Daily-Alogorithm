import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.nextLine();

        List<BigInteger> store = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String word = in.nextLine();
            StringBuilder output = new StringBuilder();

            for (char ch : word.toCharArray()) {
                if (Character.isDigit(ch)) {
                    output.append(ch); // 숫자라면 append
                } else {
                    if (output.length() > 0) {
                        store.add(new BigInteger(output.toString())); // BigInteger로 추가 01 일때 0제거
                        output.setLength(0); // StringBuilder 초기화
                    }
                }
            }

            // 마지막 남아있는 숫자 처리
            if (output.length() > 0) {
                store.add(new BigInteger(output.toString())); 
            }
        }

        Collections.sort(store);

        // 결과 출력
        for (BigInteger result : store) {
            System.out.println(result);
        }
    }
}
