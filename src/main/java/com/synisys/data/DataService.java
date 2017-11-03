package com.synisys.data;

import com.synisys.api.model.LocationDto;
import com.synisys.api.model.ProjectDto;
import com.synisys.api.model.SectorDto;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class DataService {

    public ArrayList<ProjectDto> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<ProjectDto> projects) {
        this.projects = projects;
    }

    private ArrayList<ProjectDto> projects = new ArrayList<>();

    public DataService() {
        ProjectDto p = new ProjectDto();
        p.setId(1);
        p.setCode("fd45ddfdf55 555");
        p.setTitle("asjdhasukfhksdhfsh");
        p.setDescription("dfsfkjej o; oweo jt iwet weit t iwt ");
        p.setImplementationStatusId(1);
        p.setStartDate(new Date());
        p.setEndDate(new Date());
        SectorDto[] s = {new SectorDto(1, 25), new SectorDto(2, 50)};
        p.setSectors(s);
        LocationDto[] l = {new LocationDto(1, 1, 30), new LocationDto(2, 2, 45)};
        p.setLocations(l);
        p.setModifyUser("Admin");
        p.setModifyDate(new Date());

        projects.add(p);

        p = new ProjectDto();
        p.setId(2);
        p.setCode("645dfh 555");
        p.setTitle("o;fjfij48");
        p.setDescription("gag hhth hrt hsjfj ");
        p.setImplementationStatusId(2);
        p.setStartDate(new Date());
        p.setEndDate(new Date());
        SectorDto[] ss = {new SectorDto(1, 25), new SectorDto(2, 50)};
        p.setSectors(ss);
        LocationDto[] ll = {new LocationDto(1, 1, 30), new LocationDto(2, 2, 45)};
        p.setLocations(ll);
        p.setModifyUser("user");
        p.setModifyDate(new Date());

        projects.add(p);
    }
}
