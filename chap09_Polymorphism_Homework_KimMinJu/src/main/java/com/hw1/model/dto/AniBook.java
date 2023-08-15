package com.hw1.model.dto;

public class AniBook implements java.io.Serializable {
    private int accessAge;

    public AniBook(int accessAge) {
        this.accessAge = accessAge;
    }

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }

    @Override
    public String toString() {
        return "AniBook{" +
                "accessAge=" + accessAge +
                '}';
    }
}
