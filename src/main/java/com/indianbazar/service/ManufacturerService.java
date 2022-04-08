package com.indianbazar.service;

import com.indianbazar.entites.Manufacturer;
import com.indianbazar.repository.mfg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerService {
@Autowired
mfg mfgrep;
    public  List<Manufacturer> getAllManufacturer()
    {
      List<Manufacturer>  mfgs = mfgrep.findAll();
      return mfgs;
    }
public Manufacturer getManufacturerbyID(int id)
{

    return mfgrep.findById(id).get();

}
}
