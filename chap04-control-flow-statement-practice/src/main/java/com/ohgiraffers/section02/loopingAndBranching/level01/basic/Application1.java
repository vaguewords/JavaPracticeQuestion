package com.ohgiraffers.section02.loopingAndBranching.level01.basic;

public class Application1 {

    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        while (i <= 10) {
            sum = sum + i;
            i++;
        }
        System.out.println("1부터 10까지의 합 : " + sum);
        /* 1부터 10까지 합계를 구하고 결과를 출력하세요
         *
         * -- 출력 예시 --
         * 1부터 10까지의 합 : 55
         * */

    }

}
