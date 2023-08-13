package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("과일 이름을 입력하세요");
        String fruitName = sc.nextLine();
        sc.close();
        int fruitPrice = 0;
        String errorMessage = "";

        switch (fruitName) {
            case "사과": fruitPrice = 1000;
                break;
            case "복숭아": fruitPrice = 2000;
                break;
            case "바나나": fruitPrice = 3000;
                break;
            case "키위": fruitPrice = 5000;
                break;
            default: errorMessage = "준비된 상품이 없습니다.";
                System.out.println(errorMessage); break;
        }
        System.out.println(fruitName + "의 가격은 " + fruitPrice + "원 입니다.");
    }

}
