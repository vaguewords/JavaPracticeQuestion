package com.ohgiraffers.section01.array.level02.normal;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Application1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 하나 입력하세요.");
        String scannedString = sc.nextLine();

        /*char[] scannedStringArr = scannedString.toCharArray();*/
        char[] scannedStringArr = new char[scannedString.length()];

        System.out.println("검색할 문자를 입력하세요.");
        char scannedChar = sc.next().charAt(0);

        int scannedCharCount = 0;

        for (int i = 0; i < scannedStringArr.length; i++) {
            if (scannedString.charAt(i) == scannedChar) scannedCharCount++;
        }

        System.out.println("입력하신 문자열 " + scannedString + "에서 찾으시는 문자 " + scannedChar + "은(는) " + scannedCharCount + "개 입니다.");


        /* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
         * 검색할 문자를 하나 입력 받아
         * 입력 받은 검색할 문자가 문자열에 몇개 있는지를 출력하세요
         *
         * -- 입력 예시 --
         * 문자열을 하나 입력하세요 : helloworld
         * 검색할 문자를 입력하세요 : l
         *
         * -- 출력 예시 --
         * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
         * */

    }

}
