package com.carpenter.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carpenter.booking.model.TransferAmt;

@Repository
public interface TransferAmtRepository extends JpaRepository<TransferAmt,Long>{

}
