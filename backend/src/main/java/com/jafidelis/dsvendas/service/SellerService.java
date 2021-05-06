package com.jafidelis.dsvendas.service;

import com.jafidelis.dsvendas.dto.SellerDTO;
import com.jafidelis.dsvendas.entities.Seller;
import com.jafidelis.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll() {
        return repository.findAll().stream().map(e -> new SellerDTO(e)).collect(Collectors.toList());
    }
}
