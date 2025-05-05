package org.test.X.Basic;

import java.math.BigInteger;

public class 두수의합 {


    public String solution(String a, String b){

        BigInteger biga = new BigInteger(a);
        BigInteger bigb = new BigInteger(b);

        return biga.add(bigb).toString();

    }
}
