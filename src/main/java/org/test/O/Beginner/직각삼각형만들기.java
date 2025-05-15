package org.test.O.Beginner;

import java.util.Scanner;

public class 직각삼각형만들기 {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i=1;i<=n;i++){
            System.out.println("*".repeat(i));
        }
    }



    // 나의 코드
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        StringBuilder sb = new StringBuilder();
//
//        for (int i=0;i<n;i++){
//            sb.append("*");
//            System.out.println(sb.toString());
//        }
}
