package com.ahakanzn.d14case.demo.controller;




import com.ahakanzn.d14case.demo.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/citizen")
public class CitizenController {

    @Autowired
    CitizenService citizenService;

    @GetMapping(path = "/{id}")
    public String getCitizenById(@PathVariable Long id){
        return citizenService.getCitizenById(id).getName();
    }

    @GetMapping(path = "/{name}")
    public String getCitizenByName(@PathVariable String name){
        return citizenService.getCitizenByName(name).getName();
    }
}
