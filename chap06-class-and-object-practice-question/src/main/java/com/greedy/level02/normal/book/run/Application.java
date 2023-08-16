package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        BookDTO bookDTO = new BookDTO();
        System.out.print(bookDTO.getTitle() + ", ");
        System.out.print(bookDTO.getPublisher() + ", ");
        System.out.print(bookDTO.getAuthor() + ", ");
        System.out.print(bookDTO.getPrice() + ", ");
        System.out.println(bookDTO.getDiscountRate());
        //System.out.println(bookDTO.toString());

        bookDTO.setTitle("자바의 정석");
        bookDTO.setPublisher("도우출판");
        bookDTO.setAuthor("남궁성");

        System.out.print(bookDTO.getTitle() + ", ");
        System.out.print(bookDTO.getPublisher() + ", ");
        System.out.print(bookDTO.getAuthor() + ", ");
        System.out.print(bookDTO.getPrice() + ", ");
        System.out.println(bookDTO.getDiscountRate());
        //System.out.println(bookDTO.toString());

        bookDTO = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        System.out.print(bookDTO.getTitle() + ", ");
        System.out.print(bookDTO.getPublisher() + ", ");
        System.out.print(bookDTO.getAuthor() + ", ");
        System.out.print(bookDTO.getPrice() + ", ");
        System.out.println(bookDTO.getDiscountRate());
        //System.out.println(bookDTO.toString());

    }
}
