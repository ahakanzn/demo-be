package com.ahakanzn.d14case.demo.mapper;


import com.ahakanzn.d14case.demo.dao.model.Citizen;
import com.ahakanzn.d14case.demo.dto.CitizenDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CitizenMapper {
    @Mapping(target = "id", source = "citizen.id")
    CitizenDTO citizenToCitizenDto(Citizen citizen);

    List<CitizenDTO> citizenListToCitizenDtoList(List<Citizen> citizenList);
}
