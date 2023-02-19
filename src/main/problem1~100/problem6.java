/*
문제 설명
머쓱이는 프로그래머스에 로그인하려고 합니다. 머쓱이가 입력한 아이디와 패스워드가 담긴 배열 id_pw와 회원들의 정보가 담긴 2차원 배열 db가 주어질 때, 다음과 같이 로그인 성공, 실패에 따른 메시지를 return하도록 solution 함수를 완성해주세요.

아이디와 비밀번호가 모두 일치하는 회원정보가 있으면 "login"을 return합니다.
로그인이 실패했을 때 아이디가 일치하는 회원이 없다면 “fail”를, 아이디는 일치하지만 비밀번호가 일치하는 회원이 없다면 “wrong pw”를 return 합니다.
제한사항
회원들의 아이디는 문자열입니다.
회원들의 아이디는 알파벳 소문자와 숫자로만 이루어져 있습니다.
회원들의 패스워드는 숫자로 구성된 문자열입니다.
회원들의 비밀번호는 같을 수 있지만 아이디는 같을 수 없습니다.
id_pw의 길이는 2입니다.
id_pw와 db의 원소는 [아이디, 패스워드] 형태입니다.
1 ≤ 아이디의 길이 ≤ 15
1 ≤ 비밀번호의 길이 ≤ 6
1 ≤ db의 길이 ≤ 10
db의 원소의 길이는 2입니다.
입출력 예
id_pw	db	result
["meosseugi", "1234"]	[["rardss", "123"], ["yyoom", "1234"], ["meosseugi", "1234"]]	"login"
["programmer01", "15789"]	[["programmer02", "111111"], ["programmer00", "134"], ["programmer01", "1145"]]	"wrong pw"
["rabbit04", "98761"]	[["jaja11", "98761"], ["krong0313", "29440"], ["rabbit00", "111333"]]	"fail"
입출력 예 설명
입출력 예 #1

db에 같은 정보의 계정이 있으므로 "login"을 return합니다.
입출력 예 #2

db에 아이디는 같지만 패스워드가 다른 계정이 있으므로 "wrong pw"를 return합니다.
입출력 예 #3

db에 아이디가 맞는 계정이 없으므로 "fail"을 return합니다.
        */

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for (int i = 0; i < db.length; i++) {
            // 아이디만 비교 구현
            if (db[i][0].equals(id_pw[0])) {
                // 아이디가 일치하면 비밀번호 비교 구현
                if (db[i][1].equals(id_pw[1])) {
                    return "login";
                }
                return "wrong pw";
            }
        }
        return "fail";
    }
}





