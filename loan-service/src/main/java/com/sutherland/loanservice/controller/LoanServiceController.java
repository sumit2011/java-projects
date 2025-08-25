package com.sutherland.loanservice.controller;

import com.sutherland.loanservice.entity.LoanService;
import com.sutherland.loanservice.repo.LoanServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/loans")
public class LoanServiceController {

    @Autowired
    private LoanServiceRepo loanServiceRepository;

    // Create a new loan
    @PostMapping
    public LoanService createLoan(@RequestBody LoanService loanService) {
        return loanServiceRepository.save(loanService);
    }

    // Get all loans
    @GetMapping
    public List<LoanService> getAllLoans() {
        return loanServiceRepository.findAll();
    }

   
}