package com.indianbazar.entites;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "manufacturer1")
public class Manufacturer {
@Id
int id;
String name;
String web_addr;
String main_ph;
String city;
String state;
String zip;
String tin;
Date date_created;
String status;

}
