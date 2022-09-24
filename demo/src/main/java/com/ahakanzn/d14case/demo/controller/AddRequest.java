package com.ahakanzn.d14case.demo.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddRequest {
    private String name;
    private Integer isCitizen;
    private Integer hasDrivingLicense;
}
