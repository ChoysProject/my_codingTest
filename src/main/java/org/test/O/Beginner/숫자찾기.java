package org.test.O.Beginner;

public class 숫자찾기 {

//    정수 num과 k가 매개변수로 주어질 때,
//    num을 이루는 숫자 중에 k가 있으면
//    num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

//          num	    k	result
//          29183	1	3
//        232443	4	4
//        123456	7	-1


    public int solution(int num, int k){

        String numString = String.valueOf(num);
        String kString = String.valueOf(k);

        int answer = numString.indexOf(kString);

        return answer > 0 ? answer +1 : -1;
    }

}
