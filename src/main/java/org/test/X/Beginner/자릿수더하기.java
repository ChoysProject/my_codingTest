package org.test.X.Beginner;

public class 자릿수더하기 {

//    정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
//
//    n	result
//      1234	10
//      930211	16


    public int solution (int n){

        int answer = 0;
        String stringValue = Integer.toString(n);

        for (int i=0 ;i < stringValue.length();i++){
            answer += Integer.parseInt(String.valueOf(stringValue.charAt(i)));
        }

        return answer;
    }

}
