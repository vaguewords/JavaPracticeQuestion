package com.ohgiraffers.level01.basic;

import java.awt.*;

public class Application {


    /* 실행용 메소드 */
    public static void main(String[] args) {
        Calculator calculatorResult = new Calculator();
        calculatorResult.checkMethod();
        calculatorResult.sumTwoNumber(10, 20);
        calculatorResult.multiTwoNumber(10, 20);
    }
    
}
