package com.ahakanzn.d14case.demo.service;


import com.ahakanzn.d14case.demo.controller.AddRequest;
import com.ahakanzn.d14case.demo.controller.UpdateRequest;
import com.ahakanzn.d14case.demo.dao.model.Citizen;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CitizenService {

    Optional<Citizen> getCitizenById(Long id);

    List<Citizen> getCitizenByFilters(String name, Integer numberOfChildren, Integer hasDrivingLicense, Integer isCitizen);

    void addCitizen(AddRequest request);

    void updateCitizen(UpdateRequest request);

}
