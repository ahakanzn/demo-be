package com.ahakanzn.d14case.demo.dao.repository;


import com.ahakanzn.d14case.demo.dao.model.Citizen;
import com.ahakanzn.d14case.demo.dto.CitizenDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Long> {

    Citizen getCitizenById(Long id);

    Citizen getCitizenByName(String name);

}
