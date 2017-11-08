package com.synisys.api.model;

public class ClassifierDto {
    private Integer id;
    private String name;

    public ClassifierDto() {
    }

    public ClassifierDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
