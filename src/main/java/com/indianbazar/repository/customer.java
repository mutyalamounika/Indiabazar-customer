package com.indianbazar.repository;

import com.indianbazar.entites.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface customer extends JpaRepository<Customer,Integer> {
}
