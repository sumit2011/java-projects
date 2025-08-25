package com.sutherland.aadhardetail.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sutherland.aadhardetail.entity.AadharDetail;

@Repository
public interface AadharDetailRepo extends JpaRepository<AadharDetail, Integer> {

}



