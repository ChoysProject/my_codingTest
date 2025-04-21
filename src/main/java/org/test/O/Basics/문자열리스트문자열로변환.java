package org.test.O.Basics;

public class 문자열리스트문자열로변환 {

//    문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.

//    arr	result
//["a","b","c"]	"abc"

    public String solution(String[] arr){

        return String.join("",arr);
    }

    // 나의 코드
//    StringBuilder sb = new StringBuilder();
//
//        for (String value : arr){
//        sb.append(value);
//    }
//
//        return sb.toString();
}
