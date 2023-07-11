import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int money = in.nextInt(); // 주어진 현금
        int jhMoney = money; // 준현이의 보유 현금
        int smMoney = money; // 성민이의 보유 현금
        int jhCount = 0; // 준현이의 주식 갯수
        int smCount = 0; // 성민이의 주식 갯수
        int jhSeed = 0; // 준현이의 총 자산
        int smSeed = 0; // 성민이의 총 자산

        int[] price = new int[14];

        for (int i = 0; i < price.length; i++) {
            price[i] = in.nextInt();
        }

        for (int i = 0; i < price.length; i++) {
            // 가진 돈보다 주식 가격이 싸거나 같은경우
            while (jhMoney >= price[i]) {
                jhCount++;
                jhMoney -= price[i];
            }
        }

        jhSeed = jhCount * price[13]; // 준현이의 총 매도 가격


        for (int i = 3; i < price.length; i++) {
            // 배열의 값이 3일째 하락 일때
            if (price[i - 3] > price[i - 2] && price[i - 2] > price[i - 1]) {
                while (smMoney >= price[i]) {
                    smCount++;
                    smMoney -= price[i];
                }
            }
            // 배열의 값이 3일째 상승 일때
            else if (price[i - 3] < price[i - 2] && price[i - 2] < price[i - 1]) {
                smSeed += smCount * price[i];
                smCount = 0; // 매도 햇으니, 값 초기화
            }
        }
        smSeed += smCount * price[13]; // 성민이의 총 매도 가격

        if (jhSeed > smSeed) {
            System.out.println("BNP");
        } else if (jhSeed < smSeed) {
            System.out.println("TIMING");
        } else {
            System.out.println("SAMESAME");
        }
    }
}
