package com.dazt.msscconversion.service;

import com.dazt.msscconversion.model.MeasureConversion;
import com.dazt.msscconversion.repository.MeasureConversionRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class MeasureConversionServiceImpl implements MeasureConversionService {

    private final MeasureConversionRepository measureConversionRepository;

    @Override
    public MeasureConversion findByFromAndTo(String from, String to) {
        return measureConversionRepository.findByFromAndTo(from, to);
    }

}
