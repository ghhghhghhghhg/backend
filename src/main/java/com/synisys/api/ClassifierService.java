package com.synisys.api;

import com.synisys.api.model.ClassifierDto;

public interface ClassifierService {

    ClassifierDto getCountry(Integer id);
    ClassifierDto[] getCountries();
    ClassifierDto getDistrict(Integer id);
    ClassifierDto[] getDistricts(Integer id);
    ClassifierDto getSector(Integer id);
    ClassifierDto[] getSectors();
    ClassifierDto[] getImplimentationStatuses();
    ClassifierDto getImplimentationStatus(Integer id);
}
