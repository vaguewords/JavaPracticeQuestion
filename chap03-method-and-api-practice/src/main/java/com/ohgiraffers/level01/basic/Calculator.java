package com.ohgiraffers.level01.basic;

public class Calculator {

    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }

    // 반환값 : x
    // 메소드명 : checkMethod
    // 호출하면 "메소드 호출 확인"을 출력하는 기능의 메소드


    public String sumTwoNumber(int a, int b) {
        int sumAnswer = a + b;
        String sumAnswerString = Integer.toString(sumAnswer);
        System.out.println(a+"과 " +b+"의 합은 "+sumAnswerString+"입니다.");
        return (sumAnswerString);
    }
    // 반환값 : String
    // 메소드명 : sumTwoNumber
    // 두개의 전달인자를 받아 두수의 합을 반환
    // 출력의 내용은 "10과 20의 합은 30입니다." 라는 문장을
    // 출력하는 기능

    public String multiTwoNumber(int a, int b) {
        int multiAnswer = a * b;
        String multiAnswerString = Integer.toString(multiAnswer);
        System.out.println(a+"과 " +b+"의 곱은 "+multiAnswerString+"입니다.");
        return (multiAnswerString);
    }

    // 반환값 : String
    // 메소드명 : multiTwoNumber
    // 두개의 전달인자를 받아 두수의 곱을 반환
    // 출력의 내용은 "10과 20의 곱은 200입니다." 라는 문장을
    // 출력하는 기능

}
