package com.indianbazar.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="customer")
public class Customer {
    @Id
    int id;
    @Column(name="LAST")
    String Last;
    @Column(name="FIRST")
    String First;
    @Column(name="MOBILE")
    String mobile;
}
