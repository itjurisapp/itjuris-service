package com.api.core.apicorepotato.controller;

import com.api.core.apicorepotato.api.ProcessApi;
import com.api.core.apicorepotato.model.*;
import com.api.core.apicorepotato.repository.ProcessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@CrossOrigin("*")
@RestController
public class ProcessController extends BaseController implements ProcessApi {

    @Autowired
    private ProcessRepository processRepository;

    @Override
    public ResponseEntity<ApiProcessCodeTO> createProcess(@Valid ApiProcessTO newProcess) {

        ProcessModel saveProcess = ProcessModel.builder()
                .number(newProcess.getNumber())
                .description(newProcess.getDescription())
                .category(newProcess.getCategory())
                .user(newProcess.getUser())
                .part(newProcess.getPart())
                .build();

        processRepository.save(saveProcess);

        return new ResponseEntity<>(CREATED);
    }

    @Override
    public ResponseEntity<ApiResponseProcessTO> getProcess(String number) {
        return null;
    }

    @Override
    public ResponseEntity<ApiResponseProcessTO> getProcessos() {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateProcess(String number, @Valid ApiUpdateProcessTO process) {
        return null;
    }
}
