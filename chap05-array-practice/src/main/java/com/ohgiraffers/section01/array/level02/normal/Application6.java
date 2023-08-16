package com.ohgiraffers.section01.array.level02.normal;
import java.util.Random;

public class Application6 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] randomNumArr = new int[10];


        for (int i = 0; i <= 9; i++) {
            randomNumArr[i] = random.nextInt(11);
            System.out.println(randomNumArr[i]);
        }

        int max, min;
        max = min =randomNumArr[0];

        for(int i=1;i<randomNumArr.length;i++) {
            if(max<randomNumArr[i])
                max=randomNumArr[i];
            if(min>randomNumArr[i])
                min=randomNumArr[i];
        }

        // 결과 출력
        System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d\n", max, min);

        /* 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
         * 1 ~ 10 사이의 난수를 발생시켜 배열에 초기화 후
         * 배열 전체 값과 그 값 중에서 최대값과 최소값을 찾아서 출력하세요.
         *
         * =========== 출력 ============
         * 2 10 5 2 3 7 3 7 9 7
         * 최대값 : 10
         * 최소값 : 2
         * */
    }

}
