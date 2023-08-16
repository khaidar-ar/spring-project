package com.latihan.domain;



public class Author {
    public Author() {
    }

    public Author(long id, String name, Long birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    private long id;

    private String name;

    private Long birthDate;

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

    public Long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Long birthDate) {
        this.birthDate = birthDate;
    }
}
