package com.oil_gas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oil_gas.entity.City;
@Repository
public interface oilandgas_repository extends JpaRepository<City, Integer>{

}
