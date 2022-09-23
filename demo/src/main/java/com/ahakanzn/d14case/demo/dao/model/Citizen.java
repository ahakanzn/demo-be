package com.ahakanzn.d14case.demo.dao.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name= "CITIZEN")
@Getter
@Setter
public class Citizen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false, length = 8)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "IS_CITIZEN")
    private String isCitizen;

    @Column(name = "HAS_DRIVING_LICENSE")
    private String hasDrivingLicense;


}
