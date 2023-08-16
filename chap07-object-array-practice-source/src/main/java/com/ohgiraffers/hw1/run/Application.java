package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw2.model.dto.StudentDTO;

public class Application {
    public static void main(String[] args) {
        // 객체배열을 크기 3으로 할당 한 뒤 3개의 생성자를 각각 이용하여 객체 생성 후 출력
// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
// 연봉 = (급여 + (급여 * 보너스포인트)) * 12
// 3명의 직원의 연봉 평균을 구하여 출력

        EmployeeDTO employeeDTO = new EmployeeDTO();
        EmployeeDTO[] employeeDTOArr = new EmployeeDTO[3];
        int employeeCount = 0;

        System.out.println(employeeDTOArr);

        String empName = employeeDTO.getEmpName();
        String dept = employeeDTO.getDept();
        String job = employeeDTO.getJob();
        int age = employeeDTO.getAge();
        char gender = employeeDTO.getGender();
        int salary = employeeDTO.getSalary();
        double bonusPoint = employeeDTO.getBonusPoint();
        String phone = employeeDTO.getPhone();
        String address = employeeDTO.getAddress();




        double salaryPerYear = (salary + (salary * bonusPoint)) * 12;
        System.out.println(salaryPerYear);


    }
}
