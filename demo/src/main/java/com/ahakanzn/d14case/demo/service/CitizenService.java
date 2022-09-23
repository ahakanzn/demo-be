package com.ahakanzn.d14case.demo.service;


import com.ahakanzn.d14case.demo.dao.model.Citizen;
import com.ahakanzn.d14case.demo.dto.CitizenDTO;
import org.springframework.stereotype.Service;

@Service
public interface CitizenService {

    Citizen getCitizenById(Long id);

    Citizen getCitizenByName(String name);
}
