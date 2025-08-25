package com.sutherland.loanservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sutherland.loanservice.entity.LoanService;

@Repository
public interface LoanServiceRepo extends JpaRepository<LoanService, Integer> {

}

