/*
문제 설명
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.
입출력 예
s	return
"a234"	false
"1234"	true
문제가 잘 안풀린다면😢
힌트가 필요한가요? [코딩테스트 연습 힌트 모음집]으로 오세요! → 클릭

공지 - 2022년 7월 22일 테스트케이스가 추가되었습니다.
공지 - 2022년 7월 22일 제한 사항이 추가되었습니다.
*/
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        String a = s.toLowerCase();
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);

                //  isDigit = 문자열중 숫자가 있는 경우 검증
                if (!Character.isDigit(c)) {
                    answer = false;
                    break;
                }
            }
        }
        // s의 length가 4혹은 6이 아닐경우
        else {
            answer = false;

        }
        return answer;
    }
}


