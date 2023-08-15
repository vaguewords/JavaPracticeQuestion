package com.hw1.model.dto;
import com.hw1.model.dto.CookBook;

public class CookBook implements java.io.Serializable {
    private boolean coupon;

    public CookBook() {
    }
    public CookBook(String title, String author, String publisher, boolean coupon) {

    }

    public CookBook(boolean coupon) {
        this.coupon = coupon;
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return "CookBook{" +
                "coupon=" + coupon +
                '}';
    }
}
