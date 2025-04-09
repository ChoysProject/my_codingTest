package org.test.O.Basics;

import java.util.Scanner;

public class 홀짝구분하기 {

//    자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.

//    100 입력 시
//    100 is even
//    1 입력 시
//    1 is odd

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        int result = scanner.nextInt();

        System.out.println( result + " is " + (result % 2 ==0 ? "even" : "odd"));
    }

}
