package com.nisum.demobasedatos.Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@Entity
@Table(name = "People")
@NoArgsConstructor
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //para que id sea autogenerado.
    private Long id;

    //@Column, con nombres distintos, lo agregas así, pero si yo quiero que se llame igual no es necesario.
    private String name;

    private String lastName;

    private String rut;

    private Integer age;

    //Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lasName) {
        this.lastName = lasName;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
