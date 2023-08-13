package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application6 {

    public static void main(String[] args) {

        int num1, num2;
        String operator;

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력하세요.");
        num1 = sc.nextInt();
        System.out.println("두 번째 정수를 입력하세요.");
        num2 = sc.nextInt();
        System.out.println("연산 기호를 입력하세요.");
        operator = sc.next();
        sc.close();

        int result = 0;

        switch(operator){
            case "+" :
                result = num1 + num2;
                break;
            case "-" :
                result = num1 - num2;
                break;
            case "*" :
                result = num1 * num2;
                break;
            case "/" :
                result = num1 / num2;
                break;
            case "%" :
                result = num1 % num2;
                break;
            default :
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }

    }


