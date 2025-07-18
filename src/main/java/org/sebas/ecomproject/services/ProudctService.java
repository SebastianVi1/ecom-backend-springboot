package org.sebas.ecomproject.services;

import org.sebas.ecomproject.models.Product;
import org.sebas.ecomproject.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProudctService {

    @Autowired
    private ProductRepo repo;


    public List<Product> getAllProducts(){
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).get();
    }
}
