package com.indianbazar.controller;

import com.indianbazar.entites.Manufacturer;
import com.indianbazar.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManufacturerController {
    @Autowired
    ManufacturerService mfgservice;

    @GetMapping("/getmanufacturer")
    public List<Manufacturer> getAllManufacturer() {
        List<Manufacturer> mfgs = mfgservice.getAllManufacturer();
        return mfgs;
    }

    @GetMapping("/getmanufacturer/{id}")
    public Manufacturer getManufacturerbyID(@PathVariable(value = "id") int id) {
        Manufacturer manufacturer = mfgservice.getManufacturerbyID(id);
        return manufacturer;

    }
}

