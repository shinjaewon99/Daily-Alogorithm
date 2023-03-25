/*
문제
연두는 프로그래밍 대회에 나갈 팀 이름을 정하려고 한다. 미신을 믿는 연두는 이환이에게 공식을 하나 받아왔고, 이 공식을 이용해 우승할 확률이 가장 높은 팀 이름을 찾으려고 한다.

이환이가 만든 공식은 사용하려면 먼저 다음 4가지 변수의 값을 계산해야 한다.

L = 연두의 이름과 팀 이름에서 등장하는 L의 개수
O = 연두의 이름과 팀 이름에서 등장하는 O의 개수
V = 연두의 이름과 팀 이름에서 등장하는 V의 개수
E = 연두의 이름과 팀 이름에서 등장하는 E의 개수
그 다음, 위에서 구한 변수를 다음 식에 입력하면 팀 이름의 우승할 확률을 구할 수 있다.

((L+O) × (L+V) × (L+E) × (O+V) × (O+E) × (V+E)) mod 100

연두의 영어 이름과 팀 이름 후보 N개가 주어졌을 때, 우승할 확률이 가장 높은 팀 이름을 구해보자. 확률이 가장 높은 팀이 여러가지인 경우 사전 순으로 가장 앞서는 팀 이름이 우승할 확률이 가장 높은 것이다.

입력
첫째 줄에 연두의 영어 이름이 주어진다. 둘째 줄에는 팀 이름 후보의 개수 N이 주어진다. 셋째 줄부터 N개의 줄에 팀 이름이 한 줄에 하나씩 주어진다.

연두의 영어 이름과 팀 이름은 길이는 1보다 크거나 같고, 20보다 작거나 같으며, 알파벳 대문자로만 이루어져 있다. N은 50보다 작거나 같은 자연수이다.

출력
첫째 줄에 우승할 확률이 가장 높은 팀 이름을 출력한다.

예제 입력 1
LOVE
3
JACOB
FRANK
DANO
예제 출력 1
FRANK
예제 입력 2
JANE
4
THOMAS
MICHAEL
INDY
LIU
예제 출력 2
INDY
예제 입력 3
LILLY
1
PIERRE
예제 출력 3
PIERRE
예제 입력 4
MERYLOV
5
JOHN
DAVE
STEVE
JOHN
DAVE
예제 출력 4
DAVE
예제 입력 5
LLOL
4
BVERON
CVERON
AVERON
DVERON
예제 출력 5
AVERON
예제 입력 6
VELYLEOCEVE
5
YVXHOVE
LCOKO
OGWSJVEVEDLE
WGFVSJEL
VLOLUVCBLLQVESWHEEKC
예제 출력 6
VLOLUVCBLLQVESWHEEKC
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class problem238 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (true) {
            int size = in.nextInt();
            // 0을 입력받으면 종료
            if (size == 0) {
                break;
            }
            List<String> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                list.add(in.next());
            }

            // 대소문자 구분 없이 정렬 :  String.CASE_INSENSITIVE_ORDER
            Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
            System.out.println(list.get(0));
        }
    }
}
