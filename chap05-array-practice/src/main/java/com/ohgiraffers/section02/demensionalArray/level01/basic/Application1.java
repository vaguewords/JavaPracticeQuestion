package com.ohgiraffers.section02.demensionalArray.level01.basic;

public class Application1 {

    public static void main(String[] args) {
        int[][] dimArr = new int[3][4];
        dimArr = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        for (int i = 0; i < dimArr.length; i++) {
            for (int j = 0; j < dimArr[i].length; j++) {
                System.out.print(dimArr[i][j] + " ");
            }
            System.out.println();
        }
    }


}
