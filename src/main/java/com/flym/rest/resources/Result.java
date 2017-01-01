package com.flym.rest.resources;

/**
 * Created by carlis on 17-1-1.
 */
public class Result<T> {
    private static final String SUCCESS = "success";
    private static final String ERROR = "error";

    private String status = SUCCESS;
    private String message;
    private T result;

    public Result() {}

    public Result(String status) {
        this.status = status;
    }

    public Result(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public void setError(String message) {
        this.status = ERROR;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
