/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.t4p65_clientms.resources;

import com.client.t4p65_clientms.models.Client;
import com.client.t4p65_clientms.repositories.ClientRepository;
import java.util.List;
import java.util.UUID;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clients")
public class ClientResource {
    
    private final ClientRepository ClientRepository;

    public ClientResource(ClientRepository ClientRepository) {
        this.ClientRepository = ClientRepository;
    }
      
    @PostMapping("/register")
    public Client registerClient(@RequestBody Client client){
        return ClientRepository.save(client);
    }
    
    @GetMapping("/allclients")
    public Iterable<Client> getTodosLosClientees(Model model){
        return  ClientRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Client getById(@PathVariable UUID id){
        return ClientRepository.findByid(id);
    }
    
}
