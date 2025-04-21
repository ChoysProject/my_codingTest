package org.test.O.Basics;

public class x사이의갯수 {


//    문자열 myString이 주어집니다.
//    myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를
//    순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

//      myString	result
//      "oxooxoxxox"	[1, 2, 1, 0, 1, 0]
//        "xabcxdefxghi"	[0, 3, 3, 3]

    public int[] solution(String myString) {

        String[] xArr = myString.split("x",-1);
        int[] answer = new int[xArr.length];

        for (int i=0;i<xArr.length;i++){
            answer[i] = xArr[i].length();
        }

        return answer;
    }
}
