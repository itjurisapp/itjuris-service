package com.api.core.apicorepotato.repository;


import com.api.core.apicorepotato.model.BasicDataModel;
import com.api.core.apicorepotato.model.ProcessModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BasicDataRepository extends MongoRepository<BasicDataModel, String> {

}
