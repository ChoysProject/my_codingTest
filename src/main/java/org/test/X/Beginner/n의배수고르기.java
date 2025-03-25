package org.test.X.Beginner;

public class n의배수고르기 {

//    정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
//    numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.

//    n	numlist	result
//      3	[4, 5, 6, 7, 8, 9, 10, 11, 12]	[6, 9, 12]
//      5	[1, 9, 3, 10, 13, 5]	[10, 5]
//      12	[2, 100, 120, 600, 12, 12]	[120, 600, 12, 12]
    public int[] solution(int n, int[] numlist) {
        int arraySize = 0;

        for (int i=0;i<numlist.length;i++){
            if (numlist[i]%n == 0){
                arraySize++;

            }
        }

        int[] answer = new int[arraySize];

        int k=0;

        for (int j=0;j<numlist.length;j++){
            if (numlist[j] % n ==0){
                answer[k] = numlist[j];
                k++;
            }
        }

        return answer;
    }

}
