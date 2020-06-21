package com.api.core.apicorepotato.repository;


import com.api.core.apicorepotato.model.ProcessModel;
import com.api.core.apicorepotato.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProcessRepository extends MongoRepository<ProcessModel, String> {

}
