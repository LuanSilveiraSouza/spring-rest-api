package com.simplerestapi.restapi.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Movie {

    @Size(min = 3, max = 20, message = "Nome deve conter entre 3 e 20 caracteres")
    @NotBlank(message = "Nome não pode estar em branco")
    private String name;

    private int year;

    public Movie(String name, int year) {
        this.name = name;
        this.year = year;
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
