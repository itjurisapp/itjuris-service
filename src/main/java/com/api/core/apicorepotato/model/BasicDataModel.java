package com.api.core.apicorepotato.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BasicDataModel {

    @Id
    private String id;
    private String processNumber;
    private Integer proceduralClass;
    private Integer codeLocation;
    private Integer competence;
    private String linkedProcess;
    private String bindingProcessModality;
    private String priority;
    private Integer lawsuitValue;
    private Boolean legalAssistance;
    private Integer secrecyLevel;
    private String dateAjuizamento;
    private String otherParameter;

}

