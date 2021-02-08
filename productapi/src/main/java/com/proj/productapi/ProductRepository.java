package com.proj.productapi;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productdata",
        path = "productdata")
public interface ProductRepository extends MongoRepository<Product,String> {

}
