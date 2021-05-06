package com.jafidelis.dsvendas.dto;

import com.jafidelis.dsvendas.entities.Sale;

import java.io.Serializable;
import java.time.LocalDate;

public class SaleDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;
    private SellerDTO seller;

    public SaleDTO() {

    }

    public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDTO seller) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
        this.seller = seller;
    }

    public SaleDTO(Sale entity) {
        id = entity.getId();
        visited = entity.getVisited();
        deals = entity.getDeals();
        amount = entity.getAmount();
        date = entity.getDate();
        seller = new SellerDTO(entity.getSeller());
    }

    public Long getId() {
        return id;
    }

    public Integer getVisited() {
        return visited;
    }

    public Integer getDeals() {
        return deals;
    }

    public Double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public SellerDTO getSeller() {
        return seller;
    }
}
