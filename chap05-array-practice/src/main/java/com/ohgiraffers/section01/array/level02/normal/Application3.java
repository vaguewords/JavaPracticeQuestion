package com.ohgiraffers.section01.array.level02.normal;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("양의 정수를 입력하세요.");
        int scannedSize = sc.nextInt();
        int[] scannedSizeArr = new int[scannedSize];

        for(int i=0; i < scannedSizeArr.length; i++) {
            scannedSizeArr[i] = i + 1;
            System.out.print(scannedSizeArr[i] + " ");
        }

        /* 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
         * 1부터 입력받은 값까지 배열에 초기화한 후 출력하세요
         *
         * ===== 출력 ======
         * 양의 정수를 입력하세요 : 4
         * 1 2 3 4
         * */
    }

}
