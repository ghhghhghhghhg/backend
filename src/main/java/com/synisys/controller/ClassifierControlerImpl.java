package com.synisys.controller;

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
    ClassifierService cs;

    @RequestMapping("countries/{id}")
    public ClassifierDto getCountry(@PathVariable("id") Integer id) {
        return cs.getCountry(id);
    }

    @RequestMapping("countries")
    public ClassifierDto[] getCountries() {
        return cs.getCountries();
    }

    @RequestMapping("districts/{id}")
    public ClassifierDto getDistrict(@PathVariable("id") Integer id) {
        return cs.getDistrict(id);
    }

    @RequestMapping("districts-by-country/{id}")
    public ClassifierDto[] getDistricts(@PathVariable("id") Integer id) {
        return cs.getDistricts(id);
    }

    @RequestMapping("sectors/{id}")
    public ClassifierDto getSector(@PathVariable("id") Integer id) {
        return cs.getSector(id);
    }

    @RequestMapping("sectors")
    public ClassifierDto[] getSectors() {
        return cs.getSectors();
    }

    @RequestMapping("implimentation-statuses")
    public ClassifierDto[] getImplimentationStatuses() {
        return cs.getImplimentationStatuses();
    }
}
