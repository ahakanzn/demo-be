package com.ahakanzn.d14case.demo.dto;


import com.ahakanzn.d14case.demo.dao.model.Citizen;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CitizenDTO {
    private Long id;
    private String name;
    private List<Citizen> children;
    private boolean isCitizen;
    private boolean hasDrivingLicense;
}
