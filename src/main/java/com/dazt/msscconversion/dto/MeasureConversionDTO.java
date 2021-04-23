package com.dazt.msscconversion.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@Builder
public class MeasureConversionDTO {

    private String from;

    private String to;

    private BigDecimal conversionFactor;

    private String environment;

    private OffsetDateTime lastUpdatedDate;

    private OffsetDateTime creationDate;
}
