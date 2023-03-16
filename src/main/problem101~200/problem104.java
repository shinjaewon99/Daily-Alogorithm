/*
완주하지 못한 선수
문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
입출력 예
participant	completion	return
["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"
입출력 예 설명
예제 #1
"leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #2
"vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #3
"mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.

※ 공지 - 2023년 01월 25일 테스트케이스가 추가되었습니다.
*/

import java.util.*;

public class problem104 {
    class Solution {
        public String solution(String[] participant, String[] completion) {

            // "leo", "kiki" "eden" 을 B C A라고 생각하고 오름차순 정렬
            // 완주하지 못한사람은 무조건 한명임
            Arrays.sort(participant);
            Arrays.sort(completion);

            for(int i = 0 ; i < completion.length; i++){
                if(participant[i].equals(completion[i])){
                    // 배열에서 일치하지 않는 마지막 배열이 남게된다.
                    // 그 사람이 완주자 명단에 없는사람이다.
                    continue;
                }
                else{
                    // 동일한 이름의 참가자 있을수 있음.
                    return participant[i];
                }

            }


            return participant[participant.length-1];
        }
    }
}


/*
List는 중복검증후 중복된 값의 반환이 안되는것같다.
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        List<String> pList = new ArrayList<>();
        for(String p : participant){
            pList.add(p);
        }

        List<String> cList = new ArrayList<>();
        for(String c : completion){
            pList.add(c);
        }
        Collections.sort(pList);
        Collections.sort(cList);

        for(int i = 0 ; i < cList.size(); i++){
            if(pList.get(i).equals(cList.get(i))){
                continue;
            }else{
                return pList.get(i);
            }
        }


        return pList.get(pList.size()-1);
    }
}
*/
