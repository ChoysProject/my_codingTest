package org.test.O.Basics;

public class 문자열정수의합 {


//    한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
//
//    num_str	result
//"123456789"	45
//        "1000000"	1

    public int solution(String num_str) {
        int answer = 0;
        char[] charArray = num_str.toCharArray();

        for (char value : charArray){
            answer += Integer.parseInt(String.valueOf(value));
        }

        return answer;
    }
}
