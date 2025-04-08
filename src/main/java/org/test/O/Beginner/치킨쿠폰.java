package org.test.O.Beginner;

public class 치킨쿠폰 {

    public int solution(int chicken){
        int count = 0;
        int totalChicken = chicken;

        while (true){
            totalChicken -= 10;
            totalChicken++;
            if (totalChicken<=0){
                break;
            }else {
                count++;
            }
        }
        return count;
    }
}
