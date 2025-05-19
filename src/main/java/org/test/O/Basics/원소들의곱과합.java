package org.test.O.Basics;

public class 원소들의곱과합 {

//    정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.

//    num_list	result
//[3, 4, 5, 2, 1]	1
//        [5, 7, 8, 3]	0

    public int solution(int[] num_list) {

        int x = 1;
        int addX =0;

        for (int value : num_list){
            x *= value;
            addX += value;
        }

        addX = addX * addX;

        return x < addX ? 1:0;

    }


}
