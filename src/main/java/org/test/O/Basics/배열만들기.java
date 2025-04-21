package org.test.O.Basics;

public class 배열만들기 {


//    정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로
//    저장한 배열을 return 하는 solution 함수를 완성해 주세요.

//    n	k	result
//10	3	[3, 6, 9]
//        15	5	[5, 10, 15]

    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int value = 0;
        for (int i=0;i<answer.length;i++){
            value+=k;
            answer[i] = value;
        }

        return answer;
    }

}
