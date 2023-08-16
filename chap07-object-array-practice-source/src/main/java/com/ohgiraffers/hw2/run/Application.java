package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
// while문을 사용하여 학생들의 정보를 계속 입력 받고
// 한 명씩 추가 될 때마다 카운트함
// 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
// 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
// 현재 기록된 학생들의 각각의 점수 평균을 구함
// 학생들의 정보를 모두 출력 (평균 포함)


        Scanner sc = new Scanner(System.in);

        StudentDTO studentDTOArr[] = new StudentDTO[10];
        int studentCount = 0;

        while(true) {

            System.out.print("학년 입력 : ");
            int grade = sc.nextInt();
            System.out.print("학급 입력 : ");
            int classroom = sc.nextInt();
            sc.nextLine();
            System.out.print("학생 이름 입력 : ");
            String name = sc.nextLine();
            System.out.print("국어 점수 입력 : ");
            int kor = sc.nextInt();
            System.out.print("영어 점수 입력 : ");
            int eng = sc.nextInt();
            System.out.print("수학 점수 입력 : ");
            int math = sc.nextInt();
            sc.nextLine();

            studentDTOArr[studentCount] = new StudentDTO(grade, classroom, name, kor, eng, math);
            studentCount++;

            System.out.print("학생 정보를 계속 추가할까요?(Y/N) : ");
            String yesOrNo = sc.nextLine().toUpperCase();

            if(yesOrNo.equals("N")) break;
        }

        for(StudentDTO stuList : studentDTOArr) {
            if(stuList == null) {
                break;
            }

            int studentScoreSum = stuList.getKor() + stuList.getEng() + stuList.getMath();
            int studentScoreAvg = studentScoreSum / 3;
            System.out.println(stuList.information() + "평균 점수 : " + studentScoreAvg);
        }

    }
}
