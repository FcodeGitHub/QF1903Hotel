package com.hy.hotel.pojo;

public class DataResult<T> {
    private int code;
    private String message;
    private T data;

    public DataResult() {
    }

    public DataResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public DataResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public DataResult(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
