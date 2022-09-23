package com.ahakanzn.d14case.demo.service.impl;


import com.ahakanzn.d14case.demo.dao.model.Citizen;
import com.ahakanzn.d14case.demo.dao.repository.CitizenRepository;
import com.ahakanzn.d14case.demo.dto.CitizenDTO;
import com.ahakanzn.d14case.demo.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitizenServiceImpl implements CitizenService {

    @Autowired
    CitizenRepository citizenRepository;

    @Override
    public Citizen getCitizenById(Long id) {
        return citizenRepository.getCitizenById(id);
    }

    @Override
    public Citizen getCitizenByName(String name) {
        return citizenRepository.getCitizenByName(name);
    }

}
