package com.indianbazar.repository;

import com.indianbazar.entites.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface mfg extends JpaRepository<Manufacturer,Integer> {

}
