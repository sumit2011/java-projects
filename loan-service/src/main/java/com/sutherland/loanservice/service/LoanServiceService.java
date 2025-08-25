package com.sutherland.loanservice.service;

import com.sutherland.loanservice.entity.LoanService;

import java.util.List;
import java.util.Optional;

public interface LoanServiceService {
    LoanService createLoan(LoanService loanService);
    List<LoanService> getAllLoans();
    Optional<LoanService> getLoanById(int loanId);

}