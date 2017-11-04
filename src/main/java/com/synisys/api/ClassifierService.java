package com.synisys.api;

import com.synisys.api.model.ClassifierDto;

/**
 * Created by Tatevik.Arakelyan on 02-Nov-17.
 */
public interface ClassifierService {

    ClassifierDto getCountry(Integer id);
    ClassifierDto[] getCountries();
    ClassifierDto getDistrict(Integer id);
    ClassifierDto[] getDistricts(Integer id);
    ClassifierDto getSector(Integer id);
    ClassifierDto[] getSectors();
    ClassifierDto[] getImplimentationStatuses();
}
