package com.synisys.api.model;


public class ResponseDto {
    private Integer id;
    private String message;
    private boolean success;

    public ResponseDto() {
    }

    public ResponseDto(Integer id, String message, boolean success) {
        this.id = id;
        this.message = message;
        this.success = success;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
