package com.ahakanzn.d14case.demo.dao.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name= "CITIZEN")
@Getter
@Setter
public class Parents {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CHILD_ID", nullable = false)
    private Long id;

}
