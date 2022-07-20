package com.oil_gas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oil_gas.entity.Dealer;

@Repository
public interface dealer_repo extends JpaRepository<Dealer, Integer> {
public Dealer findById(int id);
}
