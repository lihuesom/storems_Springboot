/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.t4p65_clientms.resources;

import com.client.t4p65_clientms.models.Purches;
import com.client.t4p65_clientms.repositories.PurchesRepository;
import java.util.UUID;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/purches")
public class PurchesResource {
    
    private final PurchesRepository PurchesRepository;

    public PurchesResource(PurchesRepository PurchesRepository) {
        this.PurchesRepository = PurchesRepository;
    }
    
    @PostMapping("/create")
    public Purches createproduct(@RequestBody Purches purches){
        return PurchesRepository.save(purches);
    }
    
    @GetMapping("/allpurches")
    public Iterable<Purches> getallpurches(Model model){
        return  PurchesRepository.findAll();
    }
    @GetMapping("/{id}")
    public Purches getById(@PathVariable UUID id){
        return PurchesRepository.findByid(id);
    }
    
}
