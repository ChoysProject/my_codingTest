package org.test.O.Basics;

public class A강조하기 {

//    문자열 myString이 주어집니다.
//    myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고,
//    "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.

//    myString	result
//"abstract algebra"	"AbstrAct AlgebrA"
//        "PrOgRaMmErS"	"progrAmmers"

    public String solution (String myString){
        // 최적화 코드
        return myString.toLowerCase().replaceAll("a","A");

    }

//    public String solution(String myString) {
//        char[] answer = myString.toCharArray();
//        StringBuilder sb = new StringBuilder();
//
//        for (int i=0;i<answer.length;i++){
//            if (answer[i] == 'a'){
//                sb.append('A');
//            }else if (answer[i] == 'A'){
//                sb.append('A');
//            }else {
//                sb.append(Character.toLowerCase(answer[i]));
//            }
//
//        }
//
//        return sb.toString();
//    }
}
