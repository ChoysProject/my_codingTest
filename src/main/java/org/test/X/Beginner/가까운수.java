package org.test.X.Beginner;

public class 가까운수 {

//    정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.

//    array	n	result
//[3, 10, 28]	20	28
//        [10, 11, 12]	13	12

    public int solutuon (int[] array, int n){

        int answer = array[0]; // 초기값으로 첫 번째 요소 설정
        int minDiff = Math.abs(n - answer); // 초기 차이 계산

        for (int i = 1; i < array.length; i++) {
            int currentDiff = Math.abs(n - array[i]);
            if (currentDiff < minDiff || (currentDiff == minDiff && array[i] < answer)) {
                minDiff = currentDiff;
                answer = array[i];
            }
        }

        return answer;

    }

}
