package com.jafidelis.dsvendas.controllers;

import com.jafidelis.dsvendas.dto.SaleDTO;
import com.jafidelis.dsvendas.dto.SaleSuccessDTO;
import com.jafidelis.dsvendas.dto.SalesSumDTO;
import com.jafidelis.dsvendas.dto.SellerDTO;
import com.jafidelis.dsvendas.service.SaleService;
import com.jafidelis.dsvendas.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        Page<SaleDTO> list = service.findAll(pageable);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/amount-by-seller")
    public ResponseEntity<List<SalesSumDTO>> amountGroupedBySeller() {
        List<SalesSumDTO> list = service.amountGroupedBySeller();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller() {
        List<SaleSuccessDTO> list = service.successGroupedBySeller();
        return ResponseEntity.ok(list);
    }
}
