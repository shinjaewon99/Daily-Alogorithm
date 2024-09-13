import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int e = in.nextInt(); // 지구, 1 ~ 15
        int s = in.nextInt(); // 태양, 1 ~ 28
        int m = in.nextInt(); // 달, 1 ~ 19

        int eCnt = 0;
        int sCnt = 0;
        int mCnt = 0;

        int result = 0;
        
        while(true){
            eCnt++;
            sCnt++;
            mCnt++;
            result++;

            if(eCnt == 16) eCnt = 1;
            if(sCnt == 29) sCnt = 1;
            if(mCnt == 20) mCnt = 1;

            // 입력한 값과 같은지 비교
            if(eCnt == e && sCnt == s && mCnt == m) break;
        }

        System.out.println(result);
    }
}
