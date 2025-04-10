package org.test.O.Basics;

public class 숫자0떼기 {


//    수로 이루어진 문자열 n_str이 주어질 때,
//    n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.

    public String solution(String n_str){

        // 정석
//        return n_str.replaceAll("^0+", "");

        int index =0;

        while (n_str.charAt(index) == '0'){
            index++;
        }

        return n_str.substring(index);
    }

}
