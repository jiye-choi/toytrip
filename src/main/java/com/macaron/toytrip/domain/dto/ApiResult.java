package com.macaron.toytrip.domain.dto;

import java.time.OffsetDateTime;

public class ApiResult<T> {
    private int code;
    private T body;
    private OffsetDateTime time;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public OffsetDateTime getTime() {
        return time;
    }

    public void setTime(OffsetDateTime time) {
        this.time = time;
    }
}
