package com.ahakanzn.d14case.demo.dao.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name= "CITIZEN")
@Getter
@Setter
public class Citizen implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false, length = 8)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "IS_CITIZEN")
    private Integer isCitizen;

    @Column(name = "HAS_DRIVING_LICENSE")
    private Integer hasDrivingLicense;

    @Column(name = "PARENT_ID")
    private Integer parentId;


    @OneToMany(fetch = FetchType.LAZY,mappedBy = "parentId")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Setter
    private Set<Citizen> children;

}
