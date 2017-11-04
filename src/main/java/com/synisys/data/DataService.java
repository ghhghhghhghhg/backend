package com.synisys.data;

import com.synisys.api.model.*;

import java.util.ArrayList;
import java.util.Date;

public class DataService {

    private ArrayList<ProjectDto> projects = new ArrayList<>();
    private ArrayList<ClassifierDto> countries = new ArrayList<>();
    private ArrayList<SubClassifierDto> districts = new ArrayList<>();
    private ArrayList<ClassifierDto> sectors = new ArrayList<>();
    private ArrayList<ClassifierDto> implimentationStatuses = new ArrayList<>();

    public ArrayList<ProjectDto> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<ProjectDto> projects) {
        this.projects = projects;
    }

    public ArrayList<ClassifierDto> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<ClassifierDto> countries) {
        this.countries = countries;
    }

    public ArrayList<SubClassifierDto> getDistricts() {
        return districts;
    }

    public void setDistricts(ArrayList<SubClassifierDto> districts) {
        this.districts = districts;
    }

    public ArrayList<ClassifierDto> getSectors() {
        return sectors;
    }

    public void setSectors(ArrayList<ClassifierDto> sectors) {
        this.sectors = sectors;
    }

    public ArrayList<ClassifierDto> getImplimentationStatuses() {
        return implimentationStatuses;
    }

    public void setImplimentationStatuses(ArrayList<ClassifierDto> implimentationStatuses) {
        this.implimentationStatuses = implimentationStatuses;
    }

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
        LocationDto[] l = {new LocationDto(1, 1, 30), new LocationDto(2, 3, 45)};
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
        LocationDto[] ll = {new LocationDto(1, 2, 30), new LocationDto(2, 4, 45)};
        p.setLocations(ll);
        p.setModifyUser("user");
        p.setModifyDate(new Date());

        projects.add(p);

        ClassifierDto c = new ClassifierDto();
        c.setId(1);
        c.setName("Armenia");
        countries.add(c);

        c = new ClassifierDto();
        c.setId(2);
        c.setName("Russia");
        countries.add(c);

        ClassifierDto sec = new ClassifierDto();
        sec.setId(1);
        sec.setName("Beauty");
        sectors.add(sec);

        sec = new ClassifierDto();
        sec.setId(2);
        sec.setName("Realty");
        sectors.add(sec);

        ClassifierDto i = new ClassifierDto();
        i.setId(1);
        i.setName("Going");
        implimentationStatuses.add(i);

        i = new ClassifierDto();
        i.setId(2);
        i.setName("Stoped");
        implimentationStatuses.add(i);

        SubClassifierDto d = new SubClassifierDto();
        d.setId(1);
        d.setName("Syuniq");
        d.setCountryId(1);
        districts.add(d);

        d = new SubClassifierDto();
        d.setId(2);
        d.setName("Ararat");
        d.setCountryId(1);
        districts.add(d);

        d = new SubClassifierDto();
        d.setId(3);
        d.setName("Krasnodar");
        d.setCountryId(2);
        districts.add(d);

        d = new SubClassifierDto();
        d.setId(4);
        d.setName("Sochi");
        d.setCountryId(2);
        districts.add(d);
    }
}
