package com.example.webdemo.model;

public class Products {
    private int proId;
    private String prodName;
    private int prodAmount;

    public int getProdAmount() {
        return prodAmount;
    }

    public void setProdAmount(int prodAmount) {
        this.prodAmount = prodAmount;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public Products(int proId, String prodName, int prodAmount) {
        this.proId = proId;
        this.prodName = prodName;
        this.prodAmount = prodAmount;
    }

    @Override
    public String toString() {
        return "Products{" +
                "prodAmount=" + prodAmount +
                ", proId=" + proId +
                ", prodName='" + prodName + '\'' +
                '}';
    }
}
