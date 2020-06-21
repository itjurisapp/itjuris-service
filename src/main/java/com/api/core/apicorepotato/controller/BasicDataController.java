package com.api.core.apicorepotato.controller;

import com.api.core.apicorepotato.api.BasicDatasApi;
import com.api.core.apicorepotato.model.ApiBasicDatasCodeTO;
import com.api.core.apicorepotato.model.ApiBasicDatasTO;
import com.api.core.apicorepotato.model.ApiResponseBasicDatasTO;
import com.api.core.apicorepotato.model.ApiUpdateBasicDatasTO;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;

public class BasicDataController extends BaseController implements BasicDatasApi {

    @Override
    public ResponseEntity<ApiBasicDatasCodeTO> createBasicDatas(@Valid ApiBasicDatasTO newBasicDatas) {
        return null;
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
