package com.ahakanzn.d14case.demo.dao.repository;


import com.ahakanzn.d14case.demo.dao.model.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Long> {

    Citizen getFindById(Long id);

    @Query(value = "SELECT * FROM CITIZEN " +
            "WHERE NAME LIKE %:name%" +
            " AND (SELECT COUNT(*) FROM CITIZEN WHERE PARENT_ID = ID ) = :numberOfChildren " +
            "AND HAS_DRIVING_LICENSE = :hasDrivingLicense " +
            "AND IS_CITIZEN = :isCitizen",nativeQuery = true)
    List<Citizen> getCitizenByFilters(String name, Integer numberOfChildren, Integer hasDrivingLicense, Integer isCitizen);
}
