/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.t4p65_clientms.repositories;

import com.client.t4p65_clientms.models.Product;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product,UUID>{
   Product findByid(UUID id);
}
