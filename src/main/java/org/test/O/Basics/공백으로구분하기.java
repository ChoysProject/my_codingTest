package org.test.O.Basics;

public class 공백으로구분하기 {

//    단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때,
//    my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.

//    입출력 예
//    my_string	result
//" i    love  you"	["i", "love", "you"]
//        "    programmers  "	["programmers"]


    public String[] solution(String my_string) {

        return my_string.trim().split("//s+");
    }
//    (1)trim() 통해 사이드 공백 제거
//    (2)\s표현하기 위해서 앞에 '\'붙임
//    (3)\s -> 모든 종류 공백문자(스페이즈, 탭, 줄바꿈 등)
//    (4) '+' 하나 이상의 공백문자가 연속적으로 나오는 부분 찾기 위해 사용

    // 내코드
//    public String[] solution(String my_string) {
//
//        String trimString = my_string.trim();
//        String[] answer = trimString.split("\\s+");
//        return answer;
//    }

}
