package com.synisys.controller;

import com.synisys.api.model.ClassifierDto;
import com.synisys.api.model.ProjectDto;
import com.synisys.api.model.ResponseDto;

public interface ClassifierControler {
    ClassifierDto getCountry(Integer id);
    ClassifierDto[] getCountries();
    ClassifierDto getDistrict(Integer id);
    ClassifierDto[] getDistricts(Integer id);
    ClassifierDto getSector(Integer id);
    ClassifierDto[] getSectors();
    ClassifierDto[] getImplimentationStatuses();
}
