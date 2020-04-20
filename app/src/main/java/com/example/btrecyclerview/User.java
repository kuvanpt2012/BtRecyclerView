package com.example.btrecyclerview;

public class User {
    private String name;
    private String mota;
    private int image;
    private int gia;
    private String donvi;




    public User(String name, String mota, int image, int gia, String donvi) {
        this.name = name;
        this.mota = mota;
        this.image = image;
        this.gia = gia;
        this.donvi = donvi;



    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;

    }

    public String getDonvitien() {
        return donvi;
    }

    public void setDonvitien(String donvitien) {
        this.donvi = donvitien;
    }
}


