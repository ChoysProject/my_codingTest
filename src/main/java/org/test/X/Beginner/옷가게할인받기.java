package org.test.X.Beginner;

public class 옷가게할인받기 {


//    머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
//    구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요

//        price	result
//      150,000	142,500
//      580,000	464,000

    // 삼항연상자로 풀었고, 문제가 생각보다 어려웟음
    // 이유는 할인에 대한 방법도 좋지 못했고,
    // 10원단위에 대한 계산도 틀렸음.


    public int solution(int price) {
        return price =
                price >= 500000 ? (int)(price * 0.80) :
                        price >= 300000 ? (int)(price * 0.90) :
                                price >= 100000 ? (int)(price * 0.95) :
                                        price;
    }


}
