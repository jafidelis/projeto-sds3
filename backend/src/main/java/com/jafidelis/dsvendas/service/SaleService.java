package com.jafidelis.dsvendas.service;

import com.jafidelis.dsvendas.dto.SaleDTO;
import com.jafidelis.dsvendas.dto.SaleSuccessDTO;
import com.jafidelis.dsvendas.dto.SalesSumDTO;
import com.jafidelis.dsvendas.repositories.SaleRepository;
import com.jafidelis.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        return repository.findAll(pageable).map(e -> new SaleDTO(e));
    }

    @Transactional(readOnly = true)
    public List<SalesSumDTO> amountGroupedBySeller() {
        return repository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller() {
        return repository.successGroupedBySeller();
    }
}
