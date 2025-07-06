package org.sebas.ecomproject.controller;

import org.sebas.ecomproject.models.Product;
import org.sebas.ecomproject.services.ProudctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProudctService service;


    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable String id){
        return service.getProductById(Integer.parseInt(id));
    }

}
