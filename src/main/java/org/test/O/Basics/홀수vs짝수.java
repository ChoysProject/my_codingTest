package org.test.O.Basics;

public class 홀수vs짝수 {


//    정수 리스트 num_list가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때,
//    홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요.
//    두 값이 같을 경우 그 값을 return합니다.

//    num_list	result
//    [4, 2, 6, 1, 7, 6]	17
//    [-1, 2, 5, 6, 3]	8

    public int solution(int[] num_list){

        int h = 0;
        int j = 0;

        for(int i=0;i<num_list.length;i++){
            if (i % 2 == 0){
                h += num_list[i];
            }else {
                j += num_list[i];
            }
        }

        return h > j ? h : j;

    }
}
