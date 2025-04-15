package org.test.O.Basics;

public class 배열길이에따라다른연산하기 {

//    정수 배열 arr과 정수 n이 매개변수로 주어집니다.
//    arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을,
//    arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return 하는 solution 함수를 작성해 주세요.

//    arr	n	result
//[49, 12, 100, 276, 33]	27	[76, 12, 127, 276, 60]
//        [444, 555, 666, 777]	100	[444, 655, 666, 877]

    public int[] solution(int n, int[] arr){

        for (int i = arr.length % 2 == 0 ? 1:0;i<arr.length;i+=2){
            arr[i] += n;
        }
        return arr;

    }

    // 기존 나의 소스

//    int[] answer = arr;
//
//        if (arr.length % 2 == 0){
//
//        for (int i=0;i<arr.length;i++){
//            if (i % 2 != 0){
//                answer[i] = answer[i] + n;
//            }
//        }
//
//    }else {
//        for (int i=0;i<arr.length;i++){
//            if (i % 2 == 0){
//                answer[i] = answer[i] + n;
//            }
//        }
//    }


}
