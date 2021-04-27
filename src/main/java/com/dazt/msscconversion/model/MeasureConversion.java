package com.dazt.msscconversion.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class MeasureConversion extends BaseEntity {

    @Builder
    public MeasureConversion(UUID id, Long version, Timestamp createdDate, Timestamp lastModifiedDate,
                             String from, String to, BigDecimal conversionFactor) {
        super(id, version, createdDate, lastModifiedDate);
        this.from = from;
        this.to = to;
        this.conversionFactor = conversionFactor;
    }

    @Column(name = "measure_from")
    private String from;

    @Column(name = "measure_to")
    private String to;

    @Column(precision = 19, scale = 5)
    private BigDecimal conversionFactor;
    
}
