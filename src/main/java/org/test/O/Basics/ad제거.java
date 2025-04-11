package org.test.O.Basics;

public class ad제거 {

//    문자열 배열 strArr가 주어집니다.
//    배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는
//    모든 문자열을 제거하고 남은 문자열을 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.

//입출력 예
//      strArr	result
//        ["and","notad","abcd"]	    ["and","abcd"]
//        ["there","are","no","a","ds"]	["there","are","no","a","ds"]

    public String[] solution(String[] strArr) {

        int arrayIndex = 0;
        for (String value : strArr){
            if (!value.contains("ad")){
                arrayIndex++;
            }
        }

        String[] result = new String[arrayIndex];
        int index = 0;

        for (int i=0;i<strArr.length;i++){
            if (!strArr[i].contains("ad")){
                result[index] = strArr[i];
                index++;
            }
        }
        return result;
    }
}
