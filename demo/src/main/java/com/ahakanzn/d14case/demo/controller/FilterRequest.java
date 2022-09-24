package com.ahakanzn.d14case.demo.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestBody;

@Getter
@Setter
public class FilterRequest {
    private String name;
    private Integer numberOfChildren;
    private Integer hasDrivingLicense;
    private Integer isCitizen;
}
