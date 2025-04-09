package org.test.O.Basics;

import java.util.Arrays;

public class 뒤에서5등까지 {

//    정수로 이루어진 리스트 num_list가 주어집니다.
//    num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

//    num_list	                    result
//      [12, 4, 15, 46, 38, 1, 14]	[1, 4, 12, 14, 15]

    public int[] solution(int[] num_list){

        int[] result = new int[5];

        Arrays.sort(num_list);

       for (int i=0 ;i<5;i++){
           result[i] = num_list[i];
       }

       return result;
    }

}
