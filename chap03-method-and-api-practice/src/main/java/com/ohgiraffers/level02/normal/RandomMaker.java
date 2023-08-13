package com.ohgiraffers.level02.normal;

public class RandomMaker {

    public static String rockPaperScissors() {
        String rpsAnswer = "";
        int rpsRandom = (int)((Math.random() * (3 - 0)) + 0);
        if (rpsRandom == 0) {
            rpsAnswer = "가위";
            System.out.println(rpsAnswer);
        } else if (rpsRandom == 1) {
            rpsAnswer = "바위";
            System.out.println(rpsAnswer);
        } else {
            rpsAnswer = "보";
            System.out.println(rpsAnswer);
        }
        return rpsAnswer;
    }

    public static String tossCoin() {
        String coinAnswer = "";
        int coinRandom = (int)((Math.random() * (2 - 0)) + 0);
        if (coinRandom == 0) {
            System.out.println("앞면");
        } else if (coinRandom == 1) {
            System.out.println("뒷면");
        }
        return coinAnswer;
    }


}
