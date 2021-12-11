/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.t4p65_clientms.resources;

import com.client.t4p65_clientms.models.Product;
import com.client.t4p65_clientms.repositories.ProductRepository;
import java.util.UUID;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductResource {
    private final ProductRepository ProductRepository;

    public ProductResource(ProductRepository ProductRepository) {
        this.ProductRepository = ProductRepository;
    }
    
    //Create
    @PostMapping("/create")
    public Product createproduct(@RequestBody Product product){
        return ProductRepository.save(product);
    }
    //Read
       @GetMapping("/allproducts")
    public Iterable<Product> getallproducts(Model model){
        return  ProductRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Product getById(@PathVariable UUID id){
        return ProductRepository.findByid(id);
    }
    
    //Update
    @PutMapping("/update/{id}")
    public Product update(@PathVariable UUID id,@Validated @RequestBody Product p){
        Product product = ProductRepository.findByid(id);
        
        product.setDescription(p.getDescription());
        product.setImage(p.getImage());
        product.setName(p.getName());
        product.setPrice(p.getPrice());
        product.setSize(p.getSize());
        
        
        return ProductRepository.save(product);
    }
    //Delete
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable UUID id){
        ProductRepository.deleteById(id);
    }
}
