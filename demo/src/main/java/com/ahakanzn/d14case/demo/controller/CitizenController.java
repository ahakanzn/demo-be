package com.ahakanzn.d14case.demo.controller;




import com.ahakanzn.d14case.demo.dao.model.Citizen;
import com.ahakanzn.d14case.demo.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/citizen")
public class CitizenController {

    @Autowired
    CitizenService citizenService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Citizen>> getCitizenById(@PathVariable Long id){
        return new ResponseEntity<>(citizenService.getCitizenById(id),HttpStatus.OK);
    }

    @PostMapping(path="/getWithFilter")
    public ResponseEntity<List<Citizen>> getCitizenWithFilters(@RequestBody FilterRequest request){
        return new ResponseEntity<>(citizenService.getCitizenByFilters(request.getName(),request.getNumberOfChildren(),request.getHasDrivingLicense(),request.getIsCitizen()), HttpStatus.OK);
    }

    @PostMapping(path = "/add")
    public ResponseEntity<Void> addCitizen(@RequestBody AddRequest request){
        citizenService.addCitizen(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(path = "/update")
    public ResponseEntity<Void> updateCitizen(@RequestBody UpdateRequest request){
        citizenService.updateCitizen(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}


