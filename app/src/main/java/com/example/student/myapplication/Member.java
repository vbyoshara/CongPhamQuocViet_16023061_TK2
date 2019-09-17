package com.example.student.myapplication;

public class Member {
    private int hinh;
    private int nam;
    private String ten;
    private int datNuoc;

    public Member(int hinh, int nam, String ten, int datNuoc) {
        this.hinh = hinh;
        this.nam = nam;
        this.ten = ten;
        this.datNuoc = datNuoc;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getDatNuoc() {
        return datNuoc;
    }

    public void setDatNuoc(int datNuoc) {
        this.datNuoc = datNuoc;
    }
}
