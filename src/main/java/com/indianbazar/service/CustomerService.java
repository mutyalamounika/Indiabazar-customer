package com.indianbazar.service;

import com.indianbazar.entites.Customer;
import com.indianbazar.entites.Manufacturer;
import com.indianbazar.repository.customer;
import com.indianbazar.vo.Address;
import com.indianbazar.vo.ResponseTemplatevo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    customer customrep;
    @Autowired
    RestTemplate restTemplate;

    public List<Customer> getAllCustomers() {
        List<Customer> cust = customrep.findAll();
        return cust;
    }
    public Customer getCustomersbyID(int id) {

        return customrep.findById(id).get();
    }
    public ResponseTemplatevo getCustomerwithAddress(int id) {
        ResponseTemplatevo vo = new ResponseTemplatevo();
        Customer customer = customrep.findById(id).get();
        Address address = restTemplate.getForObject("http://ADDRESS-SERVICE/address/getAddressByobjectId/" + customer.getId(), Address.class);
        vo.setCustomer(customer);
        vo.setAddress(address);
        return vo;
    }

}






