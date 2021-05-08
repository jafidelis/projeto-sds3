package com.jafidelis.dsvendas.dto;

import com.jafidelis.dsvendas.entities.Seller;

public class SaleSuccessDTO {

    private String sellerName;
    private Long visited;
    private Long deals;

    public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
        this.sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }

    public String getSellerName() {
        return sellerName;
    }

    public Long getVisited() {
        return visited;
    }

    public Long getDeals() {
        return deals;
    }
}
