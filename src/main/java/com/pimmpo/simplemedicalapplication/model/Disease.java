package com.pimmpo.simplemedicalapplication.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "disease")
public class Disease {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long diseaseId;

    private String name;
}
