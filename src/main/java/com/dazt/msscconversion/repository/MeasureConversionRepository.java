package com.dazt.msscconversion.repository;

import com.dazt.msscconversion.model.MeasureConversion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MeasureConversionRepository extends JpaRepository<MeasureConversion, UUID> {

    MeasureConversion findByFromAndTo(String from, String to);

}
