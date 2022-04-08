package com.indianbazar.controller;

import com.indianbazar.entites.Customer;
import com.indianbazar.service.CustomerService;
import com.indianbazar.vo.ResponseTemplatevo;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.sun.xml.internal.ws.api.ComponentFeature.Target.SERVICE;

@RestController
@RequestMapping("/customer")
public class Customercontroller {
    private static final String CUSTOMER_SERVICE = "customerwithaddress";
@Autowired
    CustomerService custserv;

@GetMapping("/getcustomer")
    public List<Customer> getAllCustomers() {
    List<Customer> cust = custserv.getAllCustomers();
    return cust;
}
@GetMapping("/getcustomer/{id}")
    public Customer getCustomersbyID(@PathVariable(value = "id") int id) {
    Customer cust1 = custserv.getCustomersbyID(id);
    return cust1;
}
       @CircuitBreaker(name = CUSTOMER_SERVICE,fallbackMethod = "addressServicefallBack")
       @GetMapping("/getcustomer/getcustByaddr/{id}")
       public ResponseTemplatevo getCustomerwithAddress(@PathVariable(value= "id") int id){
           return custserv.getCustomerwithAddress(id);
    }
    public   ResponseTemplatevo  addressServicefallBack(Exception e){
    System.out.println("addressservice is down");
    return null;
    }
    }







