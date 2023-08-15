package com.hw1.run;

import com.hw1.model.dto.Student;
import com.hw1.model.dto.Employee;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        // 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
// 위의 사용데이터 참고하여 3명의 학생 정보 초기화
// 위의 학생 정보 모두 출력 --> 향상된 for문 이용해서
// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
// 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
// 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
// 한 명씩 추가 될 때마다 카운트함
// 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
// 현재 기록된 사원들의 정보를 모두 출력

        Student[] studentArr = new Student[3];

        studentArr[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        studentArr[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        studentArr[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        for(Student studentPrint : studentArr) {
            System.out.println(studentPrint.information());
        }

        Employee employee = new Employee();
        Employee[] employeeArr = new Employee[10];

        int arrCount = 0;

        while(true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("사원 이름: ");
            String name = sc.nextLine();
            System.out.println("사원 나이: ");
            int age = sc.nextInt();
            System.out.println("사원 키: ");
            double height = sc.nextDouble();
            System.out.println("사원 몸무게: ");
            double weight = sc.nextDouble();
            System.out.println("사원 급여: ");
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.println("사원 부서: ");
            String dept = sc.nextLine();

            employeeArr[arrCount] = new Employee(name, age, height, weight, salary, dept);
            arrCount++;

            System.out.println("객체를 계속 추가할까요? (Y/N)");
            char yesOrNo = sc.nextLine().toUpperCase().charAt(0);
            if(yesOrNo == 'N') {
                break;
            }
        }

        for(int i = 0; i < arrCount; i++) {
            System.out.println(employeeArr[i].information());
        }

    }
}
