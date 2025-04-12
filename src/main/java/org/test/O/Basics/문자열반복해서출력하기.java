package org.test.O.Basics;

import java.util.Scanner;

public class 문자열반복해서출력하기 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        System.out.print(s.repeat(n));

    }
}
