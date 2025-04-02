package org.test.O.Beginner;

public class 숨어있는숫자덧셈 {

//    문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.


//    my_string	result
//"aAb1B2cC34oOp"	10
//        "1a2b3c4d123"	16


    public int solution(String my_string){

        char[] charArray = my_string.toCharArray();
        int answer = 0;

        for (char value : charArray){
            if (Character.isDigit(value)){
                answer += value;
            }
        }
        return answer;
    }
}
