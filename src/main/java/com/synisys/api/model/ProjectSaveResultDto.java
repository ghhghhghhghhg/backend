package com.synisys.api.model;

/**
 * Created by Tatevik.Arakelyan on 02-Nov-17.
 */
public class ProjectSaveResultDto {
    private Integer newId;
    boolean success;

    public ProjectSaveResultDto() {
    }

    public ProjectSaveResultDto(Integer newId, boolean success) {
        this.newId = newId;
        this.success = success;
    }

    public Integer getNewId() {
        return newId;
    }

    public void setNewId(Integer newId) {
        this.newId = newId;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
