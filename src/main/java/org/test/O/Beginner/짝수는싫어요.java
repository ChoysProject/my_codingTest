package org.test.O.Beginner;

public class 짝수는싫어요 {

//    정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

//    n	result
//10	[1, 3, 5, 7, 9]
//        15	[1, 3, 5, 7, 9, 11, 13, 15]
    public int[] solution(int n) {
        int arraySize = 0;

        for (int i=1;i<=n;i++){
            if(i%2!=0){
                arraySize++;
            }
        }
        int[] answer = new int[arraySize];

        int k=0;
        for (int j=1;j<=n;j++){
            if(j%2!=0){
                answer[k] = j;
                k++;
            }
        }

        return answer;
    }


}
