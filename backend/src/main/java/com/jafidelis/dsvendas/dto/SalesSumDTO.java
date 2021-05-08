package com.jafidelis.dsvendas.dto;

import com.jafidelis.dsvendas.entities.Seller;

import java.io.Serializable;

public class SalesSumDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Double sum;

    public SalesSumDTO(Seller seller, Double sum) {
        this.sellerName = seller.getName();
        this.sum = sum;
    }

    public String getSellerName() {
        return sellerName;
    }

    public Double getSum() {
        return sum;
    }
}
