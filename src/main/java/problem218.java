/*
문제
상근이는 농구의 세계에서 점차 영향력을 넓혀가고 있다. 처음에 그는 농구 경기를 좋아하는 사람이었다. 농구에 대한 열정은 그를 막을 수 없었고, 결국 상근이는 농구장을 청소하는 일을 시작했다. 상근이도 농구장을 청소하면서 감독이 되기 위해 가져야할 능력을 공부해나갔다. 서당개 3년이면 풍월을 읊듯이 상근이는 점점 감독으로 한 걸음 다가가고 있었다. 어느 날 그에게 지방의 한 프로농구팀을 감독할 기회가 생기게 되었다. 그는 엄청난 지도력을 보여주며 프로 리그에서 우승을 했고, 이제 국가대표팀의 감독이 되었다.

내일은 일본과 국가대표 친선 경기가 있는 날이다. 상근이는 내일 경기에 나설 선발 명단을 작성해야 한다.

국가대표팀의 감독이 된 이후에 상근이는 매우 게을러졌다. 그는 선수의 이름을 기억하지 못하고, 각 선수의 능력도 알지 못한다. 따라서, 누가 선발인지 기억하기 쉽게 하기 위해 성의 첫 글자가 같은 선수 5명을 선발하려고 한다. 만약, 성의 첫 글자가 같은 선수가 5명보다 적다면, 상근이는 내일 있을 친선 경기를 기권하려고 한다.

상근이는 내일 경기를 위해 뽑을 수 있는 성의 첫 글자를 모두 구해보려고 한다.

입력
첫째 줄에 선수의 수 N (1 ≤ N ≤ 150)이 주어진다. 다음 N개 줄에는 각 선수의 성이 주어진다. (성은 알파벳 소문자로만 이루어져 있고, 최대 30글자이다)

출력
상근이가 선수 다섯 명을 선발할 수 없는 경우에는 "PREDAJA" (따옴표 없이)를 출력한다. PREDAJA는 크로아티아어로 항복을 의미한다. 선발할 수 있는 경우에는 가능한 성의 첫 글자를 사전순으로 공백없이 모두 출력한다.

예제 입력 1
18
babic
keksic
boric
bukic
sarmic
balic
kruzic
hrenovkic
beslic
boksic
krafnic
pecivic
klavirkovic
kukumaric
sunkic
kolacic
kovacic
prijestolonasljednikovi
예제 출력 1
bk
예제 입력 2
6
michael
jordan
lebron
james
kobe
bryant
예제 출력 2
PREDAJA
*/

import java.util.Scanner;

public class problem218 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        int[] arr = new int[26];
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            String str = in.next();

            // 첫 글자만 검사
            char n = str.charAt(0);
            arr[n - 'a']++;
            if (arr[n - 'a'] == 5) {
                flag = true;
            }

        }
        // flag가 true로 바인딩 된거면 arr배열중 첫 글자가 같은 5명의 선수가 있다는것이다.
        // 첫 글자가 같은 선수가 5명인지 검증
        if (flag) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 5) {
                    System.out.print((char) (i + 'a'));
                }
            }
        } else {
            System.out.print("PREDAJA");
        }
    }
}



