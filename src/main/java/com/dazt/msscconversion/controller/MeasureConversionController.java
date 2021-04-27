package com.dazt.msscconversion.controller;

import com.dazt.msscconversion.dto.MeasureConversionDTO;
import com.dazt.msscconversion.mapper.MeasureConversionMapper;
import com.dazt.msscconversion.service.MeasureConversionService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequiredArgsConstructor
public class MeasureConversionController {

    @Autowired
    Environment environment;

    private final MeasureConversionMapper measureConversionMapper;

    private final MeasureConversionService measureConversionService;

    @GetMapping("/measure-conversion/from/{from}/to/{to}")
    public MeasureConversionDTO retrieveMeasureValue(
            @PathVariable String from,
            @PathVariable String to) {

        MeasureConversionDTO dto =measureConversionMapper.measureConversionToMeasureConversionDto(
                measureConversionService.findByFromAndTo(from, to));
        dto.setHostPort(environment.getProperty("local.server.port"));
        return dto;
    }

}
