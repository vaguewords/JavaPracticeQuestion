package com.ohgiraffers.section02.loopingAndBranching.level02.normal;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {


        String romanAlphabet = "abcdefghijklmnopqrstuvwxyz";

        String[] romanAlphabetArr;
        romanAlphabetArr = romanAlphabet.split("");

        for(int i=0;i<romanAlphabet.length();i++) { //출력
            System.out.print(romanAlphabetArr[i] + " ");
        }

    }

}
