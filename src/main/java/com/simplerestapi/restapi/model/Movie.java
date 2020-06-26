package com.simplerestapi.restapi.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @Column(name = "_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "name")
    @Size(min = 3, max = 20, message = "Nome deve conter entre 3 e 20 caracteres")
    @NotBlank(message = "Nome não pode estar em branco")
    private String name;

    @Column(name = "year")
    private int year;

    public Movie() {

    }

    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
