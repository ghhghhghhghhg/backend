package com.synisys.data;

import com.synisys.api.ClassifierService;
import com.synisys.api.model.ClassifierDto;
import org.springframework.stereotype.Service;


@Service
public class ClassifierServiceImpl implements ClassifierService {

    private DataAccessService data = new DataAccessService();

    /**
     * Returned country by country ID
     * @param id
     * @return
     */
    @Override
    public ClassifierDto getCountry(Integer id) {
        for (int i = 0; i < data.getCountries().size(); ++i) {
            if (data.getCountries().get(i).getId() == id) {
                return data.getCountries().get(i);
            }
        }
        return null;
    }

    /**
     * Returned countries
     * @return
     */
    @Override
    public ClassifierDto[] getCountries() {
        ClassifierDto[] countries = new ClassifierDto[data.getCountries().size()];
        for (int i = 0; i < data.getCountries().size(); ++i) {
            countries[i] = data.getCountries().get(i);
        }
        return countries;
    }

    /**
     * Returned district by district ID
     * @param id
     * @return
     */
    @Override
    public ClassifierDto getDistrict(Integer id) {
        for (int i = 0; i < data.getDistricts().size(); ++i) {
            if (data.getDistricts().get(i).getId() == id) {
                ClassifierDto classifier = new ClassifierDto();
                classifier.setId(id);
                classifier.setName(data.getDistricts().get(i).getName());
                return classifier;
            }
        }
        return null;
    }

    /**
     * Returned districts by country ID
     * @param id
     * @return
     */
    @Override
    public ClassifierDto[] getDistricts(Integer id) {
        int size = 0;
        for (int i = 0, count = 0; i < data.getDistricts().size(); ++i) {
            if(data.getDistricts().get(i).getCountryId() == id){
                size++;
            }
        }
        ClassifierDto[] districts = new ClassifierDto[size];
        for (int i = 0, count = 0; i < data.getDistricts().size(); ++i) {
            if(data.getDistricts().get(i).getCountryId() == id){
                ClassifierDto classifier = new ClassifierDto();
                classifier.setId(data.getDistricts().get(i).getId());
                classifier.setName(data.getDistricts().get(i).getName());
                districts[count++] = classifier;
            }
        }
        return districts;
    }

    /**
     * Returned sector by sector ID
     * @param id
     * @return
     */
    @Override
    public ClassifierDto getSector(Integer id) {
        for (int i = 0; i < data.getSectors().size(); ++i) {
            if (data.getSectors().get(i).getId() == id) {
                return data.getSectors().get(i);
            }
        }
        return null;
    }

    /**
     * Returned sectors
     * @return
     */
    @Override
    public ClassifierDto[] getSectors() {
        ClassifierDto[] sectors = new ClassifierDto[data.getSectors().size()];
        for (int i = 0; i < data.getSectors().size(); ++i) {
            sectors[i] = data.getSectors().get(i);
        }
        return sectors;
    }

    /**
     * Returned implementation satuses
     * @return
     */
    @Override
    public ClassifierDto[] getImplimentationStatuses() {
        ClassifierDto[] implimentationStatuses = new ClassifierDto[data.getImplimentationStatuses().size()];
        for (int i = 0; i < data.getImplimentationStatuses().size(); ++i) {
            implimentationStatuses[i] = data.getImplimentationStatuses().get(i);
        }
        return implimentationStatuses;
    }

    /**
     * Returned implementation status by implementation status ID
     * @param id
     * @return
     */
    @Override
    public ClassifierDto getImplimentationStatus(Integer id) {
        for (int i = 0; i < data.getImplimentationStatuses().size(); ++i) {
            if(data.getImplimentationStatuses().get(i).getId().equals(id)){
                return data.getImplimentationStatuses().get(i);
            }
        }
        return null;
    }
}
