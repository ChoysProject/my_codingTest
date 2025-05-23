package org.test.O.Basics;

public class 문자열앞의n글자 {

//    문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
//
//    my_string	n	result
//"ProgrammerS123"	11	"ProgrammerS"
//        "He110W0r1d"	5	"He110"

    public String solution(String my_string, int n) {

        StringBuilder sb = new StringBuilder();

        for (int i=0;i<n;i++){
            sb.append(my_string.charAt(i));
        }

        return sb.toString();
    }

    // 최적화 코드, substring을 사용하면 한줄로 해결.
//    return my_string.substring(0, n);

}
