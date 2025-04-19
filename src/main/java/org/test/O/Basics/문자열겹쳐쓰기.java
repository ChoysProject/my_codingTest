package org.test.O.Basics;

public class 문자열겹쳐쓰기 {

//    문자열 my_string, overwrite_string과 정수 s가 주어집니다.
//    문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.


//    입출력 예
//    my_string	overwrite_string	s	result
//"He11oWor1d"	"lloWorl"	2	"HelloWorld"
//        "Program29b8UYP"	"merS123"	7	"ProgrammerS123"

    public String solution(String my_string, String overwrite_string, int s){

        String before = my_string.substring(0,s);
        String after = my_string.substring(s+overwrite_string.length());

        return before + overwrite_string + after;

    }
}

// 나의 코드

//    StringBuilder sb = new StringBuilder();
//
//        for (int i=0;i<s;i++){
//        sb.append(my_string.charAt(i));
//        }
//
//        for (int j=0;j<overwrite_string.length();j++){
//        sb.append(overwrite_string.charAt(j));
//        }
//
//        for (int k=s+overwrite_string.length();k<my_string.length();k++){
//        sb.append(my_string.charAt(k));
//        }
//
//        return sb.toString();
//        }
