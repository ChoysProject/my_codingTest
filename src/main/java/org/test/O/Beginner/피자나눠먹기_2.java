package org.test.O.Beginner;

public class 피자나눠먹기_2 {


//    머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
//    피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
//    n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야
//    한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.


// 나의 코드보다 좀 더 간결하게 했다.
//    if문의 식을 더 가볍게 했다.

    public int solution(int n) {
        int answer = 1;

        while(true){
            if(6*answer%n==0) break;
            answer++;
        }

        return answer;
    }


}

// 나의 코드

//public int solution(int n) {
//    int answer = 1;
//    int pizza = 6;
//
//    while (true){
//
//        if (pizza % n ==0){
//            break;
//        }else {
//            answer++;
//            pizza+=6;
//        }
//    }
//
//    return answer;
//}