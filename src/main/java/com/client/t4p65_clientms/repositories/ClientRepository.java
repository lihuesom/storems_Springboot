/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.t4p65_clientms.repositories;

import com.client.t4p65_clientms.exceptions.EtAuthException;
import com.client.t4p65_clientms.models.Client;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;


public interface ClientRepository extends CrudRepository<Client,UUID>{
    Client findByid(UUID id);

}
