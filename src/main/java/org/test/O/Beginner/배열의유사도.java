package org.test.O.Beginner;

public class 배열의유사도 {


//    두 배열이 얼마나 유사한지 확인해보려고 합니다.
//    문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.


//    s1	s2	result
//   ["a", "b", "c"]	["com", "b", "d", "p", "c"]	2
//   ["n", "omg"]	["m", "dot"]	0


    public int solution(String[] s1, String[] s2){

        int answer =0;

        for (String value : s1){
            for (String value2 : s2){
                if (value.equals(value2)){
                    answer++;
                }
            }
        }
        return answer;
    }
}
