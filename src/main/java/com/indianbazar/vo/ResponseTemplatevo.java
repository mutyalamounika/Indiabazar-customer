package com.indianbazar.vo;

import com.indianbazar.entites.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseTemplatevo {
    Address address;
    Customer customer;
}
