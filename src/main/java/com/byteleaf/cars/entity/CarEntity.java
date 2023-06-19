package com.byteleaf.cars.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @Column(name = "kfz")
    public String kfz;

    @Column(name = "color")
    @Enumerated(EnumType.STRING)
    public Color color;

    @Column(name = "owner")
    public String owner;

}
