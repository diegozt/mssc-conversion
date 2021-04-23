package com.dazt.msscconversion.mapper;

import com.dazt.msscconversion.dto.MeasureConversionDTO;
import com.dazt.msscconversion.model.MeasureConversion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(uses = DateMapper.class)
public interface MeasureConversionMapper {

    @Mappings({
            @Mapping(source = "lastUpdatedDate", target = "lastModifiedDate"),
            @Mapping(source = "creationDate", target = "createdDate")
    })
    MeasureConversion measureConversionDtoToMeasureConversion(MeasureConversionDTO measureConversionDTO);

    @Mappings({
            @Mapping(source = "lastModifiedDate", target = "lastUpdatedDate"),
            @Mapping(source = "createdDate", target = "creationDate")
    })
    MeasureConversionDTO measureConversionToMeasureConversionDto(MeasureConversion measureConversion);

}
