package org.test.X.Beginner;

public class 모음제거 {

//    영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
//    문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
//    replaceAll([aeiou], "");
    // replaceAll ("a|e|i|o|u", "") 이렇게 해도 되더라..


    public String solution(String my_string) {
        my_string = my_string.replace("a","");
        my_string =my_string.replace("e","");
        my_string =my_string.replace("i","");
        my_string =my_string.replace("o","");
        my_string =my_string.replace("u","");

        return my_string;

    }



}
