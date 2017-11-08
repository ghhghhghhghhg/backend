package com.synisys.controller;

import com.synisys.api.ClassifierControler;
import com.synisys.api.ClassifierService;
import com.synisys.api.model.ClassifierDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class ClassifierControlerImpl implements ClassifierControler {

    @Autowired
    ClassifierService classifierService;

    @RequestMapping("countries/{id}")
    public ClassifierDto getCountry(@PathVariable("id") Integer id) {
        return classifierService.getCountry(id);
    }

    @RequestMapping("countries")
    public ClassifierDto[] getCountries() {
        return classifierService.getCountries();
    }

    @RequestMapping("districts/{id}")
    public ClassifierDto getDistrict(@PathVariable("id") Integer id) {
        return classifierService.getDistrict(id);
    }

    @RequestMapping("districts-by-country/{id}")
    public ClassifierDto[] getDistricts(@PathVariable("id") Integer id) {
        return classifierService.getDistricts(id);
    }

    @RequestMapping("sectors/{id}")
    public ClassifierDto getSector(@PathVariable("id") Integer id) {
        return classifierService.getSector(id);
    }

    @RequestMapping("sectors")
    public ClassifierDto[] getSectors() {
        return classifierService.getSectors();
    }

    @RequestMapping("implimentation-statuses")
    public ClassifierDto[] getImplimentationStatuses() {
        return classifierService.getImplimentationStatuses();
    }

    @RequestMapping("implimentation-statuses/{id}")
    public ClassifierDto getImplimentationStatus(@PathVariable("id") Integer id) {
        return classifierService.getImplimentationStatus(id);
    }
}
