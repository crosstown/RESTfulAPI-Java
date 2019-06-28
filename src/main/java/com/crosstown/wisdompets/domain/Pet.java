package com.crosstown.wisdompets.domain;

import lombok.*;

import javax.persistence.*;

/**
 * @author developer
 * @date 2019-06-24
 * @time 22:16
 */
@Entity
@Data
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String species;
    @Column
    private String sex;
    @Column
    private int age;

    public Pet(String name, String species, String sex, int age) {
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.age = age;
    }


}
