package com.ohgiraffers.section02.loopingAndBranching.level02.normal;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력");
        int scannedInt = sc.nextInt();

        String[] scannedIntArr;
        scannedIntArr = String.valueOf(scannedInt).split("");

        for(int i=0;i<scannedInt;i++) { //출력
            if ((i + 1) % 2 == 0) {
                System.out.print("박");
            } else {
                System.out.print("수");
            }
        }


        /* 정수를 입력받아 1부터 입력받은 정수까지
         * 홀수이면 "수", 짝수이면"박"이 정수만큼 누적되어 출력되게 작성하시오.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 수박수박수
         * */

    }

}
