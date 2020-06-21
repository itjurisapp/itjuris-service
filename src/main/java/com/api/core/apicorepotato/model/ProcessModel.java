package com.api.core.apicorepotato.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@RedisHash("product")
public class ProcessModel {

    @Id
    private String number;

    private String part;

    private String description;

    private String category;

    private String user;

    private DateTime date;


}
