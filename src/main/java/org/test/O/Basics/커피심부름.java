package org.test.O.Basics;

public class 커피심부름 {

//    팀의 막내인 철수는 아메리카노와 카페 라테만 판매하는 카페에서 팀원들의 커피를 사려고 합니다.
//    아메리카노와 카페 라테의 가격은 차가운 것과 뜨거운 것 상관없이 각각 4500, 5000원입니다.
//    각 팀원에게 마실 메뉴를 적어달라고 하였고, 그 중에서 메뉴만 적은 팀원의 것은 차가운 것으로
//    통일하고 "아무거나"를 적은 팀원의 것은 차가운 아메리카노로 통일하기로 하였습니다.
//
//    각 직원이 적은 메뉴가 문자열 배열 order로 주어질 때,
//    카페에서 결제하게 될 금액을 return 하는 solution 함수를 작성해주세요.
//    order의 원소는 아래의 것들만 들어오고, 각각의 의미는 다음과 같습니다.
//
//    order의 원소	의미
//"iceamericano", "americanoice"	차가운 아메리카노
//"hotamericano", "americanohot"	따뜻한 아메리카노
//"icecafelatte", "cafelatteice"	차가운 카페 라테
//"hotcafelatte", "cafelattehot"	따뜻한 카페 라테
//"americano"	아메리카노
//"cafelatte"	카페 라테
//"anything"	아무거나


    // 조금더 최적화하면 ?
    public int solution(String[] order) {
        int answer = 0;

        for (String value : order){
            answer += value.contains("cafelatte") ? 5000: 4500;
        }

        return answer;
    }



    // 나의 코드
//    public int solution(String[] order) {
//        int answer = 0;
//
//        for (String value : order){
//            if (value.contains("cafelatte")){
//                answer += 5000;
//            }else {
//                answer += 4500;
//            }
//        }
//
//        return answer;
//    }


}
