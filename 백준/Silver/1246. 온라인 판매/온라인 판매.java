import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 달걀의 갯수
        int m = in.nextInt(); // 잠재적인 고객
        int[] peple = new int[m];

        for(int i = 0; i < m; i++){
            peple[i] = in.nextInt();
        }

        Arrays.sort(peple);

        int max = Integer.MIN_VALUE;
        int price = 0;
        for(int i = 0; i < m; i++){
            int currentPrice = peple[i];
            int purchase = Math.min(m - i, n); // 현재 가격에서 달걀을 살수 있는 고객을 구함
            int currentMax = currentPrice * purchase;
            
            if(currentMax > max){
                max = currentMax;
                price = currentPrice;
            }
        }

        System.out.println(price + " " + max);
    }
}