package org.test.X.Beginner;

import java.util.*;

public class 최대값만들기 {


//    정수 배열 numbers가 매개변수로 주어집니다.
//    numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

//    최대값 뽑기에서 임포트하는 방법을 몰랐다.
    // 구현도구가 실제로 만들어줘서 직접 입력해야하는지 몰랐었다 ㅠ

//    numbers	result
//      [1, 2, 3, 4, 5]	20
//        [0, 31, 24, 10, 1, 9]	744

    // 하나 배운거,

    public int solution(int[] numbers) {
        int answer = 0;

        int[] result = new int[numbers.length];

        for (int i=0;i<numbers.length;i++){
            result[i] = numbers[i];
        }

        Arrays.sort(result);

        answer = result[numbers.length-2] * result[numbers.length-1];

        return answer;
    }

}
