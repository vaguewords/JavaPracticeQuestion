package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Book;

import java.util.Scanner;

public class LibraryMenu {
    /*
    // 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
 // LibraryManager의 insertMember() 메소드에 전달
 ==== 메뉴 ==== // 무한 반복 실행
1. 마이페이지 // LibraryManager의 myInfo() 호출하여 출력
2. 도서 전체 조회 // LibraryMenu의 selectAll() 호출
3. 도서 검색 // LibraryMenu의 searchBook() 호출
4. 도서 대여하기 // LibraryMenu의 rentBook() 호출
0. 프로그램 종료하기
    * */
    LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);
    public void mainMenu() {

        /*
        mainMenu() 프로그램 실행 시 가장 먼저 호출되는 메소드
        회원 이름, 나이, 성별을 입력받아 LibraryManager의 insertMember 메소드로 전달
        무한 반복 메뉴를 출력하여 각 메뉴 버튼 선택 시 해당 메소드 호출(클래스 구조 참고)
        */
        do {

            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");

            String keyword = "";
            int index = 0;
            int selectNo = 0;

            switch (selectNo) {
                case 1:
                    lm.myInfo();
                    break;
                case 2:
                    lm.selectAll();
                    break;
                case 3:
                    lm.searchBook(keyword);
                    break;
                case 4:
                    lm.rentBook(index);
                    break;
            }

    sc.close();
        } while (true);
    }
    public void selectAll(){
        /*
        LibraryManager의 selectAll 메소드 호출,  결과 값을 Book[] 자료형으로 받아준 뒤 for문을 통해 도서 전체 목록 출력
        */
        Scanner sc = new Scanner(System.in);
        sc.next();
        Book[] selectAllList = lm.selectAll();

        for (int i = 0; i < selectAllList.length; i++) {}
    }
    public void searchBook(){
        Scanner sc = new Scanner(System.in);
        String keyword = sc.nextLine();
        Book[] searchList = lm.searchBook(keyword);

    }
    public void rentBook(){
        Scanner sc = new Scanner(System.in);
        int rentBookIndex = sc.nextInt();
        int result = 0;
        switch (result) {
            case 0 :
                System.out.println("성공적으로 대야되었습니다.");
            case 1 :
                System.out.println("나이 제한으로 대여 불가능입니다.");
            case 2 :
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.\n" +
                        " 마이페이지를 통해 확인하세요");
        }
    }

}
