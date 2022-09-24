package com.ahakanzn.d14case.demo.service.impl;


import com.ahakanzn.d14case.demo.controller.AddRequest;
import com.ahakanzn.d14case.demo.controller.UpdateRequest;
import com.ahakanzn.d14case.demo.dao.model.Citizen;
import com.ahakanzn.d14case.demo.dao.repository.CitizenRepository;
import com.ahakanzn.d14case.demo.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitizenServiceImpl implements CitizenService {

    @Autowired
    CitizenRepository citizenRepository;


    @Override
    public Optional<Citizen> getCitizenById(Long id) {
        return citizenRepository.findById(id);
    }

    @Override
    public List<Citizen> getCitizenByFilters( String name, Integer numberOfChildren, Integer hasDrivingLicense, Integer isCitizen) {
        return citizenRepository.getCitizenByFilters(name,numberOfChildren,hasDrivingLicense, isCitizen);
    }

    @Override
    public void addCitizen(AddRequest request) {
        Citizen citizen = new Citizen();
        citizen.setName(request.getName());
        citizen.setIsCitizen(request.getIsCitizen());
        citizen.setHasDrivingLicense(request.getHasDrivingLicense());
        citizenRepository.save(citizen);
    }

    @Override
    public void updateCitizen(UpdateRequest request) {
        Citizen citizen = citizenRepository.getFindById(request.getId());
        citizen.setIsCitizen(request.getIsCitizen());
        citizen.setHasDrivingLicense(request.getHasDrivingLicense());
        citizen.setName(request.getName());
        citizenRepository.save(citizen);
    }

}
