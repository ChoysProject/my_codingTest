package org.test.O.Basics;

import java.util.Scanner;


//영어 알파벳으로 이루어진 문자열 str이 주어집니다.
// 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

//        입력 #1
//
//        aBcDeFg
//        출력 #1
//
//        AbCdEfG

public class 대소문자바꿔서출력하기 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String answer = "";

        for (char value : sc.next().toCharArray()){
            if (Character.isUpperCase(value)){
                answer += Character.toLowerCase(value);
            }else {
                answer += Character.toUpperCase(value);
            }
        }

        System.out.print(answer);

    }

}

// 이전 코드
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        StringBuilder sb = new StringBuilder();
//
//        for (char value : a.toCharArray()){
//            if (Character.isLowerCase(value)){
//                sb.append(String.valueOf(value).toUpperCase());
//            }else {
//                sb.append(String.valueOf(value).toLowerCase());
//            }
//        }
//        System.out.print(sb.toString());
//    }
