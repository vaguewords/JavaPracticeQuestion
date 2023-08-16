package com.ohgiraffers.hw2.model.dto;

public class StudentDTO implements java.io.Serializable {

    public StudentDTO() {}

    int grade;
    int classroom;
    String name;
    int kor;
    int eng;
    int math;

    @Override
    public String toString() {
        return "StudentDTO{" +
                "grade=" + grade +
                ", classroom=" + classroom +
                ", name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", main=" + math +
                '}';
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }


    public String information() {
        return "학년 : " + grade + ", 반 : " + classroom + ", 이름 : " + name
                + ", 국어 점수 : " + kor + ", 영어 점수 : " + eng + ", 수학 점수 : " + math + ", ";
    }
}
