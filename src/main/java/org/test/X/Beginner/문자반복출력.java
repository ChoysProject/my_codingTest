package org.test.X.Beginner;

public class 문자반복출력 {

//    문자열 my_string과 정수 n이 매개변수로 주어질 때,
//    my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요

//    my_string	    n	    result
//    "hello"	    3	    "hhheeellllllooo"

    public String solution(String my_string, int n) {
        String answer = "";
        char[] charValue = my_string.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i=0;i<my_string.toCharArray().length;i++){
            for (int j=0;j<n;j++){
                builder.append(charValue[i]);
            }
        }
        return answer = builder.toString();
    }




}
