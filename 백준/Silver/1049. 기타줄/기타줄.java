import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 끊어진 기타줄
        int m = in.nextInt(); // 기타줄 브랜드

        int minPack = Integer.MAX_VALUE;
        int minSingle = Integer.MAX_VALUE;
        

        for(int i = 0; i < m; i++){
            int comparePack = in.nextInt();
            int compareSingle = in.nextInt();

            minPack = Math.min(minPack, comparePack);
            minSingle = Math.min(minSingle, compareSingle);
        }

        int result = 0;

        // 패키지로 살수 있는 경우
        int packCnt = n / 6;
        int singleCnt = n % 6;

        result = packCnt * minPack + Math.min(singleCnt * minSingle, minPack);

        // 전체의 갯수를 낱개로 사는 경우와 비교
        int allSingle = n * minSingle;

        System.out.println(Math.min(result, allSingle));
    }
}