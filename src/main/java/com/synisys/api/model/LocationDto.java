package com.synisys.api.model;

/**
 * Created by Gor.Hakobyan on 03-Nov-17.
 */
public class LocationDto {
    private Integer countryId;
    private Integer districtId;
    private Integer percent;

    public LocationDto() {
    }

    public LocationDto(Integer countryId, Integer districtId, Integer percent) {
        this.countryId = countryId;
        this.districtId = districtId;
        this.percent = percent;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }
}
