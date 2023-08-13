package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("지금은 몇 월인가요? : ");
        int currentMonth = sc.nextInt();
        String currentSeason = "";

        switch(currentMonth) {
            case 12 :
            case 1 :
            case 2 :
                currentSeason = "겨울";
                break;
            case 3 :
            case 4 :
            case 5 :
                currentSeason = "봄";
                break;
            case 6 :
            case 7 :
            case 8 :
                currentSeason = "여름";
                break;
            case 9 :
            case 10:
            case 11:
                currentSeason = "가을";
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
        }

        if(currentSeason != "") {
            System.out.println(currentMonth + "월은 " + currentSeason + "입니다.");
        }
        sc.close();


    }

}
