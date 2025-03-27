package org.test.X.Beginner;

public class 대문자와소문자 {

//    문자열 my_string이 매개변수로 주어질 때,
//    대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.


//    my_string	result
//      "cccCCC"	"CCCccc"
//      "abCdEfghIJ"	"ABcDeFGHij"

    public String solusion(String my_String){

        StringBuilder sb = new StringBuilder();
        char[] charArray = my_String.toCharArray();

        for (char value : charArray){
            if (Character.isUpperCase(value)){
                sb.append(Character.toLowerCase(value));
            }else {
                sb.append(Character.toUpperCase(value));
            }
        }

        return sb.toString();
    }



}
