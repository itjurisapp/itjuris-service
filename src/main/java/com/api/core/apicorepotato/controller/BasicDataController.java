package com.api.core.apicorepotato.controller;

import com.api.core.apicorepotato.api.BasicDatasApi;
import com.api.core.apicorepotato.model.*;
import com.api.core.apicorepotato.repository.BasicDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
public class BasicDataController implements BasicDatasApi {

    @Autowired
    BasicDataRepository basicDataRepository;

    @Override
    public ResponseEntity<ApiBasicDatasCodeTO> createBasicDatas(@Valid ApiBasicDatasTO newBasicDatas) {

        BasicDataModel.builder()
                .proceduralClass(newBasicDatas.getProceduralClass())

                .build();

        return new ResponseEntity<>(CREATED);
    }

    @Override
    public ResponseEntity<Void> deleteBasicDatas(String number, @Valid ApiUpdateBasicDatasTO basicDatas) {
        return null;
    }

    @Override
    public ResponseEntity<ApiResponseBasicDatasTO> getBasicDatas(String number) {
        return null;
    }

    @Override
    public ResponseEntity<ApiResponseBasicDatasTO> getbasicDatasos() {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateBasicDatas(String number, @Valid ApiUpdateBasicDatasTO basicDatas) {
        return null;
    }
}
