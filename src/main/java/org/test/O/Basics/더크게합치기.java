package org.test.O.Basics;

public class 더크게합치기 {

    public int solution(int a, int b){

        int ab = Integer.parseInt("" + a +b);
        int ba = Integer.parseInt("" + b+a);

        return ab>ba ? ab : ba;

    }
}
