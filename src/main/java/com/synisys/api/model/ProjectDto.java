package com.synisys.api.model;

import java.util.Date;

public class ProjectDto {
    private Integer id;
    private String code;
    private String title;
    private String description;
    private Integer implementationStatusId;
    private Date startDate;
    private Date endDate;
    private SectorDto[] sectors;
    private LocationDto[] locations;
    private String modifyUser;
    private Date modifyDate;

    public ProjectDto() {
    }

    public ProjectDto(Integer id, String code, String title, String description, Integer implementationStatusId, Date startDate, Date endDate, SectorDto[] sectors, LocationDto[] locations, String modifyUser, Date modifyDate) {
        this.id = id;
        this.code = code;
        this.title = title;
        this.description = description;
        this.implementationStatusId = implementationStatusId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.sectors = sectors;
        this.locations = locations;
        this.modifyUser = modifyUser;
        this.modifyDate = modifyDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getImplementationStatusId() {
        return implementationStatusId;
    }

    public void setImplementationStatusId(Integer implementationStatusId) {
        this.implementationStatusId = implementationStatusId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public SectorDto[] getSectors() {
        return sectors;
    }

    public void setSectors(SectorDto[] sectors) {
        this.sectors = sectors;
    }

    public LocationDto[] getLocations() {
        return locations;
    }

    public void setLocations(LocationDto[] locations) {
        this.locations = locations;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}
