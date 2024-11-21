import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int b = in.nextInt(); // 버거갯수
        int c = in.nextInt(); // 사이드의 갯수
        int d = in.nextInt(); // 음료의 갯수

        int[] bStore = new int[b];
        int[] cStore = new int[c];
        int[] dStore = new int[d];

        for(int i = 0; i < b; i++){
            bStore[i] = in.nextInt();
        }
        for(int i = 0; i < c; i++){
            cStore[i] = in.nextInt();
        }
        for(int i = 0; i < d; i++){
            dStore[i] = in.nextInt();
        }

        int totalResult = 0;
        
        for(int price : bStore) totalResult += price;
        for(int price : cStore) totalResult += price;
        for(int price : dStore) totalResult += price;

        // 세일 가격 구하기기
        Arrays.sort(bStore);
        Arrays.sort(cStore);
        Arrays.sort(dStore);

        // 총 가격에서 할인이 된 금액을 뺀다
        int loop = Math.min(b, Math.min(c,d));
        int saleResult = totalResult;

        for(int i = 0; i < loop; i++){
            saleResult -= bStore[b - i - 1] * 0.1;
            saleResult -= cStore[c - i - 1] * 0.1;
            saleResult -= dStore[d - i - 1] * 0.1;
        }

        System.out.println(totalResult);
        System.out.println(saleResult);
        
    }
}