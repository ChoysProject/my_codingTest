package org.test.O.Beginner;

public class 배열두배만들기 {

//    정수 배열 numbers가 매개변수로 주어집니다.
//    numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.

//    numbers	result
//      [1, 2, 3, 4, 5]	[2, 4, 6, 8, 10]
//      [1, 2, 100, -99, 1, 2, 3]	[2, 4, 200, -198, 2, 4, 6]
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i=0;i<numbers.length;i++){
            answer[i] = numbers[i] + numbers[i];
        }

        return answer;
    }


}
