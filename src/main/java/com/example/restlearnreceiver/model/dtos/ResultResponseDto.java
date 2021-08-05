package com.example.restlearnreceiver.model.dtos;

public class ResultResponseDto {
    private Integer status;
    private String message;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResultResponseDto{" +
                "status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
