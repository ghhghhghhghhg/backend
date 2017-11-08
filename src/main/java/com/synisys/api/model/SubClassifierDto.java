package com.synisys.api.model;

/**
 * @author by Gor.Hakobyan on 03-Nov-17.
 */
public class SubClassifierDto extends ClassifierDto {
    private Integer countryId;

    public SubClassifierDto() {
        super();
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }
}
