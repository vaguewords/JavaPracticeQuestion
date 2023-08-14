package com.ohgiraffers.section01.array.level02.normal;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요.");
        int scannedSize = sc.nextInt();
        int[] scannedSizeArr = new int[scannedSize];
        System.out.println("배열 0번째 인덱스에 넣을 값을 입력하세요.");
        int scannedVariable0 = sc.nextInt();
        System.out.println("배열 1번째 인덱스에 넣을 값을 입력하세요.");
        int scannedVariable1 = sc.nextInt();
        System.out.println("배열 2번째 인덱스에 넣을 값을 입력하세요.");
        int scannedVariable2 = sc.nextInt();

        scannedSizeArr = new int[]{scannedVariable0, scannedVariable1, scannedVariable2};

        for (int i=0; i < scannedSizeArr.length; i++) {
            System.out.print(scannedSizeArr[i] + " ");

        }
        System.out.println();
        System.out.println("배열 길이: " + scannedSizeArr.length);
        System.out.println("값 총합: " + scannedVariable0 + scannedVariable1 + scannedVariable2);

        /* 사용자가 입력한 배열의 길이만큼의 정수형 배열을 선언 및 할당하고
         * 배열 인덱스 넣을 값 역시 사용자가 입력하여 배열을 초기화히세요.
         *
         * 그리고 배열 전체 값과 각 인덱스에 저장된 값들의 합을 출력핫헤요.
         *
         * ========= 출력 ===========
         * 정수를 입력하세요 : 3
         * 배열 0번째 인덱스에 넣을 값 : 1
         * 배열 1번째 인덱스에 넣을 값 : 2
         * 배열 2번째 인덱스에 넣을 값 : 3
         *
         * 1 2 3
         * 총합 : 6
         *
         * */
    }

}
