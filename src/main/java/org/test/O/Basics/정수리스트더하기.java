package org.test.O.Basics;

public class 정수리스트더하기 {

//    정수가 담긴 리스트 num_list가 주어집니다.
//    num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.

//    num_list   result
//[3, 4, 5, 2, 1]   393
//        [5, 7, 8, 3]   581

    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int value : num_list){
            if (value % 2 == 0){
                sb1.append(String.valueOf(value));
            }else {
                sb2.append(String.valueOf(value));
            }
        }

        return Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
    }


}
