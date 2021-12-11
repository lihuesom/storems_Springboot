/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.t4p65_clientms.models;


import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class Client extends EntityWithUUID{
    private String name;
    private Long phone;
    private String address;
    
    
//    CREATE TABLE client (
//     id         UUID NOT NULL,
//     NAME       VARCHAR(255),
//     phone      BIGINT,
//     address    VARCHAR(255),
//     PRIMARY KEY (id)
//  );
    
//    //links
//    https://pixabay.com/photos/dumbbells-shoes-sneakers-2465478/
//    https://stackoverflow.com/questions/51276703/how-to-store-postgresql-jsonb-using-springboot-jpa
//    https://developer.okta.com/blog/2019/02/20/spring-boot-with-postgresql-flyway-jsonb
}
