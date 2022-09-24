package com.ahakanzn.d14case.demo.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateRequest {
    private Long id;
    private String name;
    private Integer isCitizen;
    private Integer hasDrivingLicense;
}
