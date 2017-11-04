package com.synisys.api.model;

/**
 * Created by Gor.Hakobyan on 03-Nov-17.
 */
public class SubClassifierDto extends ClassifierDto {
    private Integer countryId;

    public SubClassifierDto() {
        super();
    }

    public SubClassifierDto(Integer id, String name, Integer countryId) {
        super(id, name);
        this.countryId = countryId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }
}
