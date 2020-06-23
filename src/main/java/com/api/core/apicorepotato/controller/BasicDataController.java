package com.api.core.apicorepotato.controller;

import com.api.core.apicorepotato.api.BasicDatasApi;
import com.api.core.apicorepotato.model.*;
import com.api.core.apicorepotato.repository.BasicDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

import java.util.List;
import java.util.Optional;

import static com.api.core.apicorepotato.service.utils.ParserUtil.convertValue;
import static org.springframework.http.HttpStatus.*;

@RestController
public class BasicDataController implements BasicDatasApi {

    @Autowired
    BasicDataRepository basicDataRepository;

    @Override
    public ResponseEntity<ApiBasicDatasCodeTO> createBasicDatas(@Valid ApiBasicDatasTO newBasicDatas) {
        BasicDataModel model = convertValue(newBasicDatas, BasicDataModel.class);
        basicDataRepository.save(model);
        return new ResponseEntity<>(CREATED);
    }

    @Override
    public ResponseEntity<ApiBasicDatasResponseTO> getBasicDatas(String number) {
        Optional model = basicDataRepository.findById(number);
        validateModel(model);
        ApiBasicDatasResponseTO to = convertValue(model.get(), ApiBasicDatasResponseTO.class);
        return new ResponseEntity<>(to, OK);
    }

    @Override
    public ResponseEntity<ApiResponseBasicDatasTO> getBasicDatasAll() {
        List<BasicDataModel> models = basicDataRepository.findAll();
        ApiResponseBasicDatasTO list = new ApiResponseBasicDatasTO();
        models.forEach(m -> {
            ApiBasicDatasResponseTO to = convertValue(m, ApiBasicDatasResponseTO.class);
            list.addBasicDatasItem(to);
        });
        return new ResponseEntity<>(list, OK);
    }

    @Override
    public ResponseEntity<Void> updateBasicDatas(String number, @Valid ApiUpdateBasicDatasTO basicDatas) {
        Optional model = basicDataRepository.findById(number);
        validateModel(model);
        BasicDataModel updateModel = convertValue(basicDatas, BasicDataModel.class);

        ApiBasicDatasResponseTO to = convertValue(model.get(), ApiBasicDatasResponseTO.class);
        updateModel.setProcessNumber(number);

        basicDataRepository.save(updateModel);

        return new ResponseEntity<>(OK);
    }

    @Override
    public ResponseEntity<Void> deleteBasicDatas(String number, @Valid ApiUpdateBasicDatasTO basicDatas) {
        Optional model = basicDataRepository.findById(number);
        validateModel(model);
        BasicDataModel deleteModel = convertValue(basicDatas, BasicDataModel.class);
        deleteModel.setId(number);
        basicDataRepository.delete(deleteModel);

        return new ResponseEntity<>(OK);
    }

    private void validateModel(Optional model){
        if (!model.isPresent()) throw new ResponseStatusException(NOT_FOUND, "Nenhum objeto encontrado!");
    }
}
