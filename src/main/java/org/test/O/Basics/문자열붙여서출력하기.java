package org.test.O.Basics;

import java.util.Scanner;

public class 문자열붙여서출력하기 {

//    두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
//    입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.
//    입력 #1
//
//    apple pen
//    출력 #1
//
//    applepen

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        System.out.print(a+b);


    }

}
