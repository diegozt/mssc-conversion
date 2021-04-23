package com.dazt.msscconversion.service;

import com.dazt.msscconversion.model.MeasureConversion;

public interface MeasureConversionService {

    MeasureConversion findByFromAndTo(String from, String to);

}
