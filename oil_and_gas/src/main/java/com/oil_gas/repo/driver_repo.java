package com.oil_gas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oil_gas.entity.Driver;

@Repository
public interface driver_repo extends JpaRepository<Driver, Integer> {

}
