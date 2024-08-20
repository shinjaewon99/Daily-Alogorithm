class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String userId = id_pw[0];
        
        for (String[] dbs : db) {
            if (userId.equals(dbs[0])) { // 아이디가 일치하는지 확인
                if (id_pw[1].equals(dbs[1])) { // 비밀번호가 일치하는지 확인
                    return "login";
                }
                return "wrong pw";
            }
        }
        return "fail"; // 아이디가 일치하지 않는 경우
    }
}
