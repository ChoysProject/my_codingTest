package org.test.O.Basics;

public class l로만들기 {

//    알파벳 소문자로 이루어진 문자열 myString이 주어집니다.
//    알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.

//    myString	result
//"abcdevwxyz"	"lllllvwxyz"
//        "jjnnllkkmm"	"llnnllllmm"

    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        char[] charArray = myString.toCharArray();

        for (char value : charArray){
            if (value <= 'l'){
                answer.append(String.valueOf('l'));
            }else {
                answer.append(String.valueOf(value));
            }
        }

        return answer.toString();
    }

}
