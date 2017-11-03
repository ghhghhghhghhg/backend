package com.synisys.api.model;


public class SectorDto {
    private Integer id;
    private Integer percent;

    public SectorDto() {
    }

    public SectorDto(Integer id, Integer percent) {
        this.id = id;
        this.percent = percent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }
}
