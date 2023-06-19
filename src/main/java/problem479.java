/*
문제
서울사이버대학교에는 멘토링 프로그램이 있다. 멘토링 프로그램은 한 명의 멘토(선배학습자)가 여러 명의 멘티(후배학습자)에게 대학 생활에 대한 노하우와 정보 등을 전수하는 것이다.

빅데이터·AI 센터에서 딥러닝 서버를 돌리며 바쁜 나날을 보내던 노교수는, 어느 날 멘토링 회의 참석 요청이 들어와 이를 준비하던 도중 멘토-멘티 순서쌍 목록이 적힌 노트를 찾았다. 하지만 노트가 제대로 정리되어 있지 않아 분석이 어려웠으므로, 마침 센터에서 인턴을 하는 대학원생 뚜루에게 목록의 정렬을 맡기기로 했다.

하지만 논문을 쓰느라 수면 부족에 시달리고 있는 뚜루는 이러한 프로그램을 짤 틈이 나지 않았기 때문에, 당신에게 다시 목록을 맡겼다. 목록이 주어질 때 멘토를 기준으로 사전 순으로 정렬하되, 멘토가 같은 순서쌍들에 대해선 멘티의 사전 역순으로 정렬하자.

입력
첫 번째 줄에 멘토-멘티 순서쌍의 수
$N$이 주어진다. (
$1 \le N \le 100\,000$)

두 번째 줄부터
$N$개의 줄에 걸쳐 목록에 포함된 각 순서쌍의 멘토의 이름과 멘티의 이름이 공백 하나로 구분되어 주어진다. 이름은 소문자로만 구성되며, 20자를 넘지 않는다. A가 B의 멘토인 동시에 B가 A의 멘토일 수 있다. 멘토와 멘티가 동일할 수 있다. 똑같은 멘토-멘티 순서쌍이 중복해서 주어지지 않는다.

출력
 
$N$개의 줄에 걸쳐 정렬된 멘토-멘티 순서쌍 목록을 입력과 동일한 형식으로 출력한다.

예제 입력 1
5
alice bob
alice dave
eve mallory
peggy victor
alice carol
예제 출력 1
alice dave
alice carol
alice bob
eve mallory
peggy victor
예제 입력 2
8
cgiosy jhnah
son kim
son lee
cgiosy leejseo
cgiosy junseo
son hwang
cgiosy sean
cgiosy cologne
예제 출력 2
cgiosy sean
cgiosy leejseo
cgiosy junseo
cgiosy jhnah
cgiosy cologne
son lee
son kim
son hwang
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem479 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String[] f = input.readLine().split(" ");
        int f1 = Integer.parseInt(f[0]);
        int f2 = Integer.parseInt(f[1]);
        int c = Integer.parseInt(input.readLine());
        int n = Integer.parseInt(input.readLine());

        int tempA = f1 * n + f2;
        int tempB = c * n;

        if (tempA <= tempB && f1 <= c) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

