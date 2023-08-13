package com.ohgiraffers.section01.conditional.level01.basic;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("임의의 정수를 입력하세요.");
        int scanInt = sc.nextInt();
        if (scanInt % 2 == 0) {
            System.out.println("짝수다.");
        } else {
            System.out.println("홀수다.");
        } sc.close();

    }

}
